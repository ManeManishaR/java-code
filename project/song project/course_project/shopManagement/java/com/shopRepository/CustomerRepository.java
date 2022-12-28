package com.shopRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.util.Streamable;

import com.shop.Entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

	String getCustomerByName = null;

	@Query("from Customer where Buyproduct=:b")

	List<Customer> getCustomerByBuyproduct(@Param("b") String Buyproduct);
	
	//@Query("from Customer where studentName=:s")
		@Query("from Customer where lower(CustomerName) like :s%")
		static
		
		

		void deleteById(Sort id) {
	}

		static void deleteAllCustomers() {
			// TODO Auto-generated method stub
			
		}

		static List<Customer> getByCustomerBuyproduct(String buyproduct) {
			// TODO Auto-generated method stub
			return null;
		}

		static List<Customer> getCustomerByBuyproduct(List<Customer> customers) {
			// TODO Auto-generated method stub
			return null;
		}

		
		
//		@Query("select p from Customer p where p.CustomerName=?1")
//		List<Customer> getCustomerByName(String CustomerName);
	}
		
	
