package com.shop.Entity;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="customer_name", nullable=false)
	private String customerName;
	
	@Column(name="customer_no", nullable = false)
	private long customer_no; 
	
	@Column(name="Buyproduct", nullable = false)
	private String buyproduct;
	
	@Column(name="Rupee",nullable = false)
	private int rupee;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="shop_name")
	private String shopname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(long customer_no) {
		this.customer_no = customer_no;
	}

	public String getBuyproduct() {
		return buyproduct;
	}

	public void setBuyproduct(String buyproduct) {
		this.buyproduct = buyproduct;
	}

	public int getRupee() {
		return rupee;
	}

	public void setRupee(int rupee) {
		this.rupee = rupee;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public static void setOwner(Owner owner) {
		// TODO Auto-generated method stub
		
	}

	public static boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
}
	
	