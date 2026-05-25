package fooditem.service;

import java.util.List;

import fooditem.dto.requestdto.FoodItemRequestDto;
import fooditem.dto.responsedto.FoodItemResponseDto;

public interface FoodItemService {
	
	FoodItemResponseDto createfooditem(Integer restaurantid,FoodItemRequestDto request);
	
	List<FoodItemResponseDto> getallfood();
	
	FoodItemResponseDto getFoodbyid(Integer foodid);
	
	List<FoodItemResponseDto> getFoodbyrestaurant(Integer restaurantid);
	
	FoodItemResponseDto update(Integer foodid,FoodItemRequestDto request);
	
	String delete(Integer foodid);
	
	List<FoodItemResponseDto> getfoodbycategory(String category);
	
	List<FoodItemResponseDto> getfoodbyavailability(Boolean available);
	

}
