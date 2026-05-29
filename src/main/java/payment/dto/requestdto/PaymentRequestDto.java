package payment.dto.requestdto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PaymentRequestDto {
	   @NotNull(message="Id should not be null")
	   private Integer paymentid;
	
	   @NotNull(message="Please enter the amount")
	    private Double amount;

	    @NotBlank(message="Payment methods shoulb be UPT or Card or cash")
	    private String paymentMethod; // UPI, CARD, CASH

	    @NotBlank(message="Payment status")
	    private String paymentStatus; // SUCCESS, FAILED, PENDING

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

}
