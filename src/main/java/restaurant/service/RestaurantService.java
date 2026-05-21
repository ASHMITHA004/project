package restaurant.service;

import java.util.List;

import restaurant.dto.requestdto.RestaurantRequestDto;
import restaurant.dto.responsedto.RestaurantResponseDto;

public interface RestaurantService {
	
	RestaurantResponseDto createrestaurant(RestaurantRequestDto request);
	
	List<RestaurantResponseDto> getallRestaurant();
	
	RestaurantResponseDto getrestaurantbyid(Integer restaurantid);
	
	RestaurantResponseDto updaterestaurant(Integer restaurantid,RestaurantRequestDto request);
	
	String deleterestaurant(Integer restaurantid);
	
	List<RestaurantResponseDto> getrestaurantbylocation(String location);

}
