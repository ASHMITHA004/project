package restaurant.dto.responsedto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RestaurantResponseDto {
	
    @NotNull(message="Restaurant id shoule not be null")
	private Long restaurantid;
    @NotBlank(message="Restaurant name should not be blank")
	private String restaurantname;
    @NotBlank(message="Choose the restaurant location")
	private String location;
	private Double rating;
	@NotBlank(message="contact number required")
	private String contactNumber;
	public Long getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(Long restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	

}
