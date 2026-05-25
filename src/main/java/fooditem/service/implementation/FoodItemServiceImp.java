package fooditem.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fooditem.dto.requestdto.FoodItemRequestDto;
import fooditem.dto.responsedto.FoodItemResponseDto;
import fooditem.entity.FoodItemEntity;
import fooditem.exception.DuplicateFoodException;
import fooditem.exception.FoodNotFoundException;
import fooditem.repository.FoodItemRepository;
import fooditem.service.FoodItemService;
import restaurant.entity.RestaurantEntity;
import restaurant.exception.RestaurantNotFoundException;
import restaurant.repository.RestaurantRepository;

@Service
public class FoodItemServiceImp implements FoodItemService {
	
	@Autowired
	public FoodItemRepository fooditemrepository;
	
	@Autowired
	public RestaurantRepository restaurantrepository;
	
	
	public FoodItemResponseDto createfooditem(Integer restaurantid,FoodItemRequestDto request) {
		if(fooditemrepository.existsById(request.getFoodid())) {
			throw new DuplicateFoodException("Food already existed"+" "+request.getFoodid());
		}
		RestaurantEntity restaurant = restaurantrepository.findById(restaurantid)
		        .orElseThrow(() -> new RestaurantNotFoundException("Restaurant not found"));
		
		
		FoodItemEntity entity=MaptoEntity(request);
		entity.setRestaurant(restaurant);
		FoodItemEntity save=fooditemrepository.save(entity);
		return MapToResponse(save);
		
		
	}
	
	public List<FoodItemResponseDto> getallfood(){
		return fooditemrepository.findAll().stream().map(r->MapToResponse(r)).collect(Collectors.toList());
		
		
	}
	
	public FoodItemResponseDto getFoodbyid(Integer foodid) {
		FoodItemEntity entity=fooditemrepository.findById(foodid).orElseThrow(()->new FoodNotFoundException("Food Not Found"));
		return MapToResponse(entity);
		
	}
	
	public List< FoodItemResponseDto> getFoodbyrestaurant(Integer restaurantid) {
		
		List<FoodItemEntity> food=fooditemrepository.findbyrestaurantid(restaurantid);
		if(food.isEmpty()) {
			throw new FoodNotFoundException("Food is not avalibale in that restaurant"+" "+restaurantid);
			
		}
		return food.stream().map(r->MapToResponse(r)).collect(Collectors.toList());
		
		
		
	}
	public FoodItemResponseDto update(Integer foodid,FoodItemRequestDto request) {
		FoodItemEntity response=fooditemrepository.findById(foodid).orElseThrow(()->new FoodNotFoundException("Food is not available"));
		response.setFoodid(request.getFoodid());
		response.setFoodname(request.getFoodname());
		response.setPrice(request.getPrice());
		response.setAvailable(request.getAvailable());
		response.setCategory(request.getCategory());
		FoodItemEntity update=fooditemrepository.save(response);
		return MapToResponse(update);
	}
	
	public String delete(Integer foodid) {
		FoodItemEntity response=fooditemrepository.findById(foodid)	.orElseThrow(()->new FoodNotFoundException("Cant able to delete the food"));
		fooditemrepository.delete(response);
		return "Food deleted successfully";
	}
	
	public List<FoodItemResponseDto> getfoodbycategory(String category) {
		List<FoodItemEntity> response=fooditemrepository.findbycategory(category);
		if(response.isEmpty()) {
			throw new FoodNotFoundException("That category food is not available");
		}
		return response.stream().map(r->MapToResponse(r)).collect(Collectors.toList());
		
		
	}
	public List<FoodItemResponseDto> getfoodbyavailability(Boolean available){
		List<FoodItemEntity> response=fooditemrepository.findbyavailability(available);
		if(response.isEmpty()) {
			throw new FoodNotFoundException("That  food is not available");
		}
		return response.stream().map(r->MapToResponse(r)).collect(Collectors.toList());
		
	}
	
	
	//Mappers
	public FoodItemEntity MaptoEntity(FoodItemRequestDto dto) {
		FoodItemEntity entity=new FoodItemEntity();
		entity.setFoodid(dto.getFoodid());
		entity.setFoodname(dto.getFoodname());
		entity.setPrice(dto.getPrice());
		entity.setCategory(dto.getCategory());
		entity.setAvailable(dto.getAvailable());
		return entity;
	}
	
	public FoodItemResponseDto MapToResponse(FoodItemEntity entity) {
		FoodItemResponseDto response=new FoodItemResponseDto();
		response.setFoodid(entity.getFoodid());
		response.setFoodname(entity.getFoodname());
		response.setPrice(entity.getPrice());
		response.setCategory(entity.getCategory());
		response.setAvailable(entity.getAvailable());
		response.setRestaurantId(entity.getRestaurant().getRestaurantid());
		response.setRestaurantName(entity.getRestaurant().getRestaurantname());
		return response;
		
	}

}
