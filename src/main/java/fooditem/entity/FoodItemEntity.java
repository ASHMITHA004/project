package fooditem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import restaurant.entity.RestaurantEntity;
@Entity
public class FoodItemEntity {
	
    @Id
	private Integer foodid;
	private String foodname;
	private Double price;
	private String category;
	private Boolean available;
	@ManyToOne
	@JoinColumn(name="restaurant_id")
	private RestaurantEntity restaurant;
	
	//getters and setters
	public Integer getFoodid() {
		return foodid;
	}
	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public RestaurantEntity getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(RestaurantEntity restaurant) {
		this.restaurant = restaurant;
	}
	
	

}
