package restaurant.controller;

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

import restaurant.dto.requestdto.RestaurantRequestDto;
import restaurant.dto.responsedto.RestaurantResponseDto;
import restaurant.service.implementation.RestaurantServiceImp;

@RestController
@RequestMapping("api/restaurant")
public class RestaurantController {
	@Autowired
	public RestaurantServiceImp restaurantservice;
	
	@PostMapping()
	public ResponseEntity<RestaurantResponseDto> createrestaurant(@RequestBody RestaurantRequestDto request) {
		RestaurantResponseDto restaurant=restaurantservice.createrestaurant(request);
		return ResponseEntity.ok(restaurant);
	
	}
	@GetMapping()
	public ResponseEntity<List<RestaurantResponseDto>> getallRestaurant(){
		List<RestaurantResponseDto> response=restaurantservice.getallRestaurant();
		return ResponseEntity.ok(response);
		
		
	}
	
	@GetMapping("/{restaurantid}")
	public ResponseEntity<RestaurantResponseDto> getrestaurantbyid(@PathVariable Integer restaurantid) {
		RestaurantResponseDto response=restaurantservice.getrestaurantbyid(restaurantid);
		return ResponseEntity.ok(response);
		
		
	}
	
	@PutMapping("/{restaurantid}")
	public ResponseEntity<RestaurantResponseDto> updaterestaurant(@PathVariable Integer restaurantid,@RequestBody RestaurantRequestDto request) {
		RestaurantResponseDto response=restaurantservice.updaterestaurant(restaurantid,request);
		return ResponseEntity.ok(response);
		
	}
	
	@DeleteMapping("/{restaurantid}")
	public ResponseEntity<String> deleterestaurant(@PathVariable Integer restaurantid) {
		String response=restaurantservice.deleterestaurant(restaurantid);
		return ResponseEntity.ok(response);
		
	}
	
	@GetMapping("/location/{location}")
	public ResponseEntity<List<RestaurantResponseDto>> getrestaurantbylocation(@PathVariable String location){
		List<RestaurantResponseDto> response=restaurantservice.getrestaurantbylocation(location);
		return ResponseEntity.ok(response);
		
	}
	
	

}
