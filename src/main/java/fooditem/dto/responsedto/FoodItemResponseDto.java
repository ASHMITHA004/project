package fooditem.dto.responsedto;



public class FoodItemResponseDto {
	
	    private Integer foodid;

	    private String foodname;

	    private Double price;

	    private String category;

	    private Boolean available;

	    private Integer restaurantId;

	    private String restaurantName;
	    
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

		public Integer getRestaurantId() {
			return restaurantId;
		}

		public void setRestaurantId(Integer restaurantId) {
			this.restaurantId = restaurantId;
		}

		public String getRestaurantName() {
			return restaurantName;
		}

		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}
	    
	    

	
	   
	    
	    

}
