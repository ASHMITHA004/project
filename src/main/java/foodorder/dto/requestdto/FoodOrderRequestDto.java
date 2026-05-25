package foodorder.dto.requestdto;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class FoodOrderRequestDto {
	
	   @NotNull(message = "Food order id is required")
	    private Integer foodorderid;

	    @NotNull(message = "Customer id is required")
	    private Integer customerid;

	    @NotEmpty(message = "Food items cannot be empty")
	    private List<Integer> fooditemids;

	    // getters and setters

	    public Integer getFoodorderid() {
	        return foodorderid;
	    }

	    public void setFoodorderid(Integer foodorderid) {
	        this.foodorderid = foodorderid;
	    }

	    public Integer getCustomerid() {
	        return customerid;
	    }

	    public void setCustomerid(Integer customerid) {
	        this.customerid = customerid;
	    }

	    public List<Integer> getFooditemids() {
	        return fooditemids;
	    }

	    public void setFooditemids(List<Integer> fooditemids) {
	        this.fooditemids = fooditemids;
	    }

}
