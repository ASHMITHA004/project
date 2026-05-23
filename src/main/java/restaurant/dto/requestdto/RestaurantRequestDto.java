package restaurant.dto.requestdto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class RestaurantRequestDto {
	@NotNull(message="Please enter the restaurant id")
	private Integer restaurantid;
	@NotBlank(message="Restuarant name should not be null")
	 private String restaurantname;
	@NotBlank(message="Location should not be Blank")
	 private String location;
	 private Double rating;
	 @NotBlank(message="Contact number required")
	 @Pattern(regexp = "[0-9]{10}", message = "Contact number must be 10 digits")
	 private String contactNumber;
	 
	 //getters and setters
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
	 public Integer getRestaurantid() {
		 return restaurantid;
	 }
	 public void setRestaurantid(Integer restaurantid) {
		 this.restaurantid = restaurantid;
	 }
	 
	 
	 

}
