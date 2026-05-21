package fooditem.dto.requestdto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class FoodItemRequestDto {
	
	@NotBlank(message = "Food item name should not be blank")
    private String foodname;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private Double price;

    @NotBlank(message = "Category should not be blank")
    private String category;

    @NotNull(message = "Availability status is required")
    private Boolean available;
    
    //getters and setters

	public String getFooditemname() {
		return foodname;
	}

	public void setFooditemname(String foodname) {
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

}
