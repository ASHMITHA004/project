package customer.entity;

import java.util.List;

import foodorder.entity.FoodOrderEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

@Entity
public class CustomerEntity {
	@Id
	private Integer customerid;
	private String customername;
	private String email;
	private String customerphone;
	private String customeraddress;
	@OneToMany(mappedBy="customer")
	private List<FoodOrderEntity> orders;
	//getters and setters
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public List<FoodOrderEntity> getOrders() {
		return orders;
	}
	public void setOrders(List<FoodOrderEntity> orders) {
		this.orders = orders;
	}
	
	

}
