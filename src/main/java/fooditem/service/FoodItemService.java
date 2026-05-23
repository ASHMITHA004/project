package fooditem.service;

import java.util.List;

import fooditem.dto.requestdto.FoodItemRequestDto;
import fooditem.dto.responsedto.FoodItemResponseDto;

public interface FoodItemService {
	
	FoodItemResponseDto createfooditem(Integer restaurantid,FoodItemRequestDto request);
	
	List<FoodItemResponseDto> getallfood();
	
	FoodItemResponseDto getFoodbyid(Integer foodid);
	
	FoodItemResponseDto getFoodbyrestaurant(Integer foodid);
	
	FoodItemResponseDto update(Integer foodid,FoodItemRequestDto request);
	
	String delete(Integer foodid);
	
	FoodItemResponseDto getfoodbycategory(String category);
	
	FoodItemResponseDto getfoodbyavailability(boolean available);
	

}
