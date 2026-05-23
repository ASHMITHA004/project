package restaurant.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurant.dto.requestdto.RestaurantRequestDto;

import restaurant.dto.responsedto.RestaurantResponseDto;
import restaurant.entity.RestaurantEntity;
import restaurant.exception.DuplicateRestaurantException;
import restaurant.exception.RestaurantNotFoundException;
import restaurant.repository.RestaurantRepository;
import restaurant.service.RestaurantService;



@Service
public class RestaurantServiceImp implements RestaurantService {
	
	@Autowired
	public RestaurantRepository restaurantrepository;
	

	public  RestaurantResponseDto createrestaurant(RestaurantRequestDto request) {
		boolean exist=restaurantrepository.existsById(request.getRestaurantid());
		if(exist) {
			throw new DuplicateRestaurantException("Restaurant already existed"+" "+request.getRestaurantid());
		}
		RestaurantEntity entity=MapToEntity(request);
		RestaurantEntity saved=restaurantrepository.save(entity);
		return MaptoResponse(saved);
		
	}
	
	public List<RestaurantResponseDto> getallRestaurant(){
		return restaurantrepository.findAll().stream().map(r->MaptoResponse(r)).collect(Collectors.toList());
	}
	
	public RestaurantResponseDto getrestaurantbyid(Integer restaurantid) {
		RestaurantEntity entity= restaurantrepository.findById(restaurantid).orElseThrow(()->new RestaurantNotFoundException("Restaurant not found"));
		return MaptoResponse(entity);
	}
	
	public RestaurantResponseDto updaterestaurant(Integer restaurantid,RestaurantRequestDto request) {
		RestaurantEntity entity=restaurantrepository.findById(restaurantid).orElseThrow(()->new RestaurantNotFoundException("Restaurant not found "+" "+restaurantid));
		entity.setRestaurantid(request.getRestaurantid());
		entity.setRestaurantname(request.getRestaurantname());
		entity.setRating(request.getRating());
		entity.setLocation(request.getLocation());
		entity.setContactNumber(request.getContactNumber());
		RestaurantEntity update=restaurantrepository.save(entity);
		return MaptoResponse(update);
		
		
	}
	
	public String deleterestaurant(Integer restaurantid) {
		RestaurantEntity entity=restaurantrepository.findById(restaurantid).orElseThrow(()->new RestaurantNotFoundException("Restaurant not found"));
		return "Restauratn Deleted Successfully";
	}
	
	public List<RestaurantResponseDto> getrestaurantbylocation(String location){
		List<RestaurantEntity> restaurant=restaurantrepository.findbylocation(location);
		if(restaurant.isEmpty()) {
			throw new RestaurantNotFoundException("Restaurant Not Found");
			
		}
		return restaurant.stream().map(r->MaptoResponse(r)).collect(Collectors.toList());
	}
	//Mappers
	
	public RestaurantEntity MapToEntity(RestaurantRequestDto dto) {
		RestaurantEntity entity=new RestaurantEntity();
		entity.setRestaurantname(dto.getRestaurantname());
		entity.setLocation(dto.getLocation());
		entity.setRating(dto.getRating());
		entity.setContactNumber(dto.getContactNumber());
		return entity;
		
	}
	
	public RestaurantResponseDto MaptoResponse(RestaurantEntity entity) {
		RestaurantResponseDto dto=new RestaurantResponseDto();
		dto.setRestaurantid(entity.getRestaurantid());
		dto.setRestaurantname(entity.getRestaurantname());
		dto.setRating(entity.getRating());
		dto.setLocation(entity.getLocation());
		dto.setContactNumber(entity.getContactNumber());
		return dto;
		
		
	}
	

}
