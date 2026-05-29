package foodorder.service;

import java.util.List;

import foodorder.dto.requestdto.FoodOrderRequestDto;
import foodorder.dto.responsedto.FoodOrderResponseDto;

public interface FoodOrderService {
	
	FoodOrderResponseDto createorder(FoodOrderRequestDto request,Integer customerid);
	
	List<FoodOrderResponseDto> getorder();
	
	FoodOrderResponseDto getorderbyid(Integer foodorderid);
	
	FoodOrderResponseDto getorderbycustomer(Integer customerid);
	
	FoodOrderResponseDto updateorder(Integer foodorderid);

}
