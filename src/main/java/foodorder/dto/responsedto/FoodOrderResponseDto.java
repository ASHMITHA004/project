package foodorder.dto.responsedto;

import java.time.LocalDateTime;
import java.util.List;

public class FoodOrderResponseDto {
	
	 private Integer foodorderid;

	    private LocalDateTime orderDate;

	    private Double totalAmount;

	    private String orderstatus;

	    private Integer customerid;

	    private String customername;

	    private List<String> fooditems;

	    // getters and setters

	    public Integer getFoodorderid() {
	        return foodorderid;
	    }

	    public void setFoodorderid(Integer foodorderid) {
	        this.foodorderid = foodorderid;
	    }

	    public LocalDateTime getOrderDate() {
	        return orderDate;
	    }

	    public void setOrderDate(LocalDateTime orderDate) {
	        this.orderDate = orderDate;
	    }

	    public Double getTotalAmount() {
	        return totalAmount;
	    }

	    public void setTotalAmount(Double totalAmount) {
	        this.totalAmount = totalAmount;
	    }

	    public String getOrderstatus() {
	        return orderstatus;
	    }

	    public void setOrderstatus(String orderstatus) {
	        this.orderstatus = orderstatus;
	    }

	    public Integer getCustomerid() {
	        return customerid;
	    }

	    public void setCustomerid(Integer customerid) {
	        this.customerid = customerid;
	    }

	    public String getCustomername() {
	        return customername;
	    }

	    public void setCustomername(String customername) {
	        this.customername = customername;
	    }

	    public List<String> getFooditems() {
	        return fooditems;
	    }

	    public void setFooditems(List<String> fooditems) {
	        this.fooditems = fooditems;
	    }

}
