package com.shopService;

import java.util.List;

import com.shop.Entity.Customer;
import com.shopDTO.CustomerDTO;
import com.shopRepository.OwnerRepository;


public interface CustomerService {
	String createCustomer(Customer customer);
	static CustomerDTO updateCustomer(int id, Customer customert) {
		// TODO Auto-generated method stub
		return null;
	}
	 CustomerDTO getCustomerById(int id);
	static List<CustomerService> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	static String deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	void deleteAllCustomers();
	
     static List<CustomerDTO> getCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}
	List<CustomerDTO> getCustomerByBuyproduct(String Buyproduct);
	
 static CustomerDTO assignOwnerToCustomer(int id, String customerName) {
		// TODO Auto-generated method stub
		return null;
	}
	void setOwnerRepository(OwnerRepository ownerRepository);
	CustomerDTO assignOwnerToCustomer(String customerName);
	static List<CustomerDTO> getCustomerBycustomer_no(int customer_no) {
		// TODO Auto-generated method stub
		return null;
	}
	String deleteCustomerById();
	List<CustomerDTO> getCustomerByName();
	CustomerDTO assignOwnerToCustomer(int id, int customerId);
	List<CustomerDTO> getAllCustomer();
}


