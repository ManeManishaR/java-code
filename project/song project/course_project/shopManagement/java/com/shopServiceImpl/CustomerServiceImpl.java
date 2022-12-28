package com.shopServiceImpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.entity.Student;
import com.repository.StudentRepository;
import com.shop.Entity.Customer;
import com.shop.Entity.Owner;
import com.shop.util.Converter;
import com.shopDTO.CustomerDTO;
import com.shopRepository.CustomerRepository;
import com.shopRepository.OwnerRepository;
import com.shopService.CustomerService;
public  class CustomerServiceImpl implements CustomerService{

	 private CustomerRepository Customerrepo;
		@Autowired
		    public CustomerServiceImpl(CustomerRepository Customerrepo) {
		        this.Customerrepo = Customerrepo;
		}
		 public List<Customer> getAllCustomers(){
		        // TODO Auto-generated method stub
	        return Customerrepo.findAll();
	    }
		 public Optional<Customer> findById(int id) {
		        // TODO Auto-generated method stub
		        return Customerrepo.findById(id);
		    }
		  @Override
		    public Optional<Customer> findByBuyproduct(String buyproduct) {
		        // TODO Auto-generated method stub
		        return Customerrepo.findByBuyproduct(buyproduct);
		    }
}