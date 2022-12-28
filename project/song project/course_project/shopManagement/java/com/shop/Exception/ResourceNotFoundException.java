package com.shop.Exception;

import com.shop.Entity.Customer;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private static Object fieldValue;
	
	public ResourceNotFoundException(String resourceName, String customer) {
		super(String.format("%s not found with %s : '%s'",resourceName,customer,fieldValue));
		
		this.resourceName = resourceName;
		this.setFieldValue(customer);
		this.setFieldValue(fieldValue);
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String customer) {
		this.fieldName = customer;
	}

	public Object getFieldValue() {
		return fieldValue;
	}

	@SuppressWarnings("static-access")
	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}
	}

