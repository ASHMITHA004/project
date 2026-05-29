package customer.service;

import java.util.List;

import customer.dto.requestdto.CustomerRequestDto;
import customer.dto.responsedto.CustomerResponseDto;

public interface CustomerService {
	
	CustomerResponseDto createcustomer(CustomerRequestDto request);
	
	List<CustomerResponseDto> getallcustomer();
	
	CustomerResponseDto getcustomerbyid(Integer customerid);
	
	CustomerResponseDto updatecustomer(CustomerRequestDto request,Integer customerid);
	
	String deletecusotmer(Integer customerid);
	


}
