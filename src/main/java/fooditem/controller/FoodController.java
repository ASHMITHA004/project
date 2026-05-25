package fooditem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fooditem.dto.requestdto.FoodItemRequestDto;
import fooditem.dto.responsedto.FoodItemResponseDto;
import fooditem.service.implementation.FoodItemServiceImp;

@RestController
@RequestMapping("/api/fooitem")
public class FoodController {
	@Autowired
	public FoodItemServiceImp fooditemserviceimp;
	
	@PostMapping("/api/restaurant/{restaurantid}/fooditem")
	public ResponseEntity<FoodItemResponseDto> createfooditem(@PathVariable Integer restaurantid,@RequestBody FoodItemRequestDto request) {
		FoodItemResponseDto  response=fooditemserviceimp.createfooditem(restaurantid, request);
		return ResponseEntity.ok(response);
		
	}
	
	@GetMapping()
	public ResponseEntity<List<FoodItemResponseDto>> getallfood(){
		List<FoodItemResponseDto > response=fooditemserviceimp.getallfood();
		return ResponseEntity.ok(response);
		
		
	}
	@GetMapping("/{foodid}")
	public ResponseEntity<FoodItemResponseDto> getFoodbyid(@PathVariable Integer foodid) {
		FoodItemResponseDto response=fooditemserviceimp.getFoodbyid(foodid);
		return ResponseEntity.ok(response);
		
		
	}
	@GetMapping("/api/restaurant/{restaurantid}/fooditem")
	public ResponseEntity<List<FoodItemResponseDto>> getFoodbyrestaurant(@PathVariable Integer restaurantid){
		List<FoodItemResponseDto > response=fooditemserviceimp.getFoodbyrestaurant(restaurantid);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/{foodid}")
	public ResponseEntity<FoodItemResponseDto> update(@PathVariable Integer foodid,@RequestBody FoodItemRequestDto request) {
		FoodItemResponseDto response=fooditemserviceimp.update(foodid,request);
		return ResponseEntity.ok(response);
		
		
	}
	
    @DeleteMapping("/{foodid}")
	public ResponseEntity<String> delete(@PathVariable Integer foodid) {
		String response=fooditemserviceimp.delete(foodid);
		return ResponseEntity.ok(response);
		
	}
    
    @GetMapping("/category/{category}")
    public ResponseEntity<List<FoodItemResponseDto>> getfoodbycategory(@PathVariable String category){
    	List<FoodItemResponseDto > response=fooditemserviceimp.getfoodbycategory(category);
		return ResponseEntity.ok(response);
    	
    }
    
    @GetMapping(" /available")
    public ResponseEntity<List<FoodItemResponseDto>> getfoodbyavailablility(@PathVariable Boolean available){
    	List<FoodItemResponseDto > response=fooditemserviceimp.getfoodbyavailability(available);
		return ResponseEntity.ok(response);
    	
    }

}
