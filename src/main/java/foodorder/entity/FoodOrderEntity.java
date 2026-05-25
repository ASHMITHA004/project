package foodorder.entity;

import java.time.LocalDateTime;
import java.util.List;

import customer.entity.CustomerEntity;
import fooditem.entity.FoodItemEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class FoodOrderEntity {
	
	@Id
	private Integer foodorderid;
	private LocalDateTime orderDate;
	private Double totalAmount;
	private String orderstatus;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customer;
	@ManyToMany
	private List<FoodItemEntity> foodItems;
	
	//getters and setters

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

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public List<FoodItemEntity> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItemEntity> foodItems) {
		this.foodItems = foodItems;
	}
	

}
