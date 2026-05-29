package payment.entity;

import foodorder.entity.FoodOrderEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PaymentEntity {
	
	@Id
	private Integer paymentid;
	private Double amount;
	private String paymentMethod;
	private String paymentStatus;
	
	@OneToOne
	@JoinColumn(name = "order_id")
	private FoodOrderEntity foodOrder;
	//getters and setters
	public Integer getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(Integer paymentid) {
		this.paymentid = paymentid;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public FoodOrderEntity getFoodOrder() {
		return foodOrder;
	}
	public void setFoodOrder(FoodOrderEntity foodOrder) {
		this.foodOrder = foodOrder;
	}
	
	

}
