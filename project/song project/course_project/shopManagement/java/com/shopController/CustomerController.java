package com.shopController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.Entity.Customer;
import com.shop.util.Converter;
import com.shopDTO.CustomerDTO;
import com.shopService.CustomerService;

@RestController

public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	//build create customer REST API
		@PostMapping("/createCustomer")
		public ResponseEntity<String>createCustomer(@RequestBody CustomerDTO  CustomerDTO)
		{
			final Customer customer= Converter.convertToEntity(CustomerDTO);
			customerService.createCustomer(customer);
			return new ResponseEntity<String>("New Customer details added",
					HttpStatus.CREATED);
		}
		//build update Customer details REST API
		@PutMapping("/updateCustomer/{identity}")
		private CustomerDTO updateCustomer(@PathVarible("identity") int id,@RequestBody CustomerDTO CustomerDTO)
		{
			 Customer customer1 =Converter.convertToEntity(CustomerDTO);
				 
			 
			return CustomerService.updateCustomer(id, customer1);
		}



			//build get Customer  details using id REST API
		@GetMapping("/getCustomerByName/{name}")
		public void getCustomerById(@PathVariable ("name") String name, @RequestBody CustomerDTO CustomerDTO) {
	
			try {
				return;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//build get all Customer details REST API
		@GetMapping ("/getAllCustomers")
		public List<CustomerService> getAllCustomers()
		{
			try {
				return CustomerService.getAllCustomers();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

		//build delete Customer details using id REST APIService.getAllCustomers();
@DeleteMapping("/deleteCustomerById/{id}")
public String deleteCustomerById(@PathVariable("id") int id)
{
	return CustomerService.deleteCustomerById(id);
}

@DeleteMapping("/deleteAllCustomers")
public ResponseEntity<String> deleteAllStudents()
{
	customerService.deleteAllCustomers();
	return new ResponseEntity<String>("All Customers details "
			+ "have been deleted",HttpStatus.OK);
}

		//build delete Customer details using id REST API
@GetMapping("/getStudentByName/{name}")
public List<CustomerDTO> getStudentByName(@PathVariable("name") String customerName)
{
	return CustomerService.getCustomerByName(customerName);
}

@GetMapping("/getCustomerBycustomer_no/{email}")
public List<CustomerDTO> getCustomerBycustomer_no(@PathVariable("customer_no") int customer_no)
{
	return CustomerService.getCustomerBycustomer_no(customer_no);
}


@PostMapping("/assignOwnerToCustomer/{CustomerId}/{Buyproduct}")
public CustomerDTO assignAddressToCustomer(@PathVariable("CustomerId") int id ,
		@PathVariable("Buyproduct") String Buyproduct)
{
	return CustomerService.assignOwnerToCustomer(id, Buyproduct);
}
}

	