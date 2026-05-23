package restaurant.entity;

import java.util.List;

import fooditem.entity.FoodItemEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class RestaurantEntity {
	@Id
	private Integer restaurantid;
	private String restaurantname;
	private String location;
	private Double rating;
	private String contactNumber;
	
	@OneToMany(mappedBy="restaurant")
	private List<FoodItemEntity> foodItems;
	
	//getters and setters
	
	
	
	public String getRestaurantname() {
		return restaurantname;
	}
	public Integer getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(Integer restaurantid) {
		this.restaurantid = restaurantid;
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
	public List<FoodItemEntity> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<FoodItemEntity> foodItems) {
		this.foodItems = foodItems;
	}
	
	

}
