package payment.dto.responsedto;

public class PaymentResponseDto {
	
	    private Integer paymentid;
	    private Double amount;
	    private String paymentMethod;
	    private String paymentStatus;
	    private Integer orderId;

	    public Integer getId() {
	        return paymentid;
	    }

	    public void setId(Integer id) {
	        this.paymentid = id;
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

	    public Integer getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(Integer orderId) {
	        this.orderId = orderId;
	    }

}
