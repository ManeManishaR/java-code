package com.shopServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.Entity.Owner;
import com.shop.util.OwnerConverter;
import com.shopRepository.OwnerRepository;
import com.shopService.OwnerService;

@Service
public abstract class OwnerServiceImpl implements OwnerService {
	@Autowired
	OwnerRepository ownerRepository;
	@Autowired
	OwnerConverter ownerConverter;
	@Override
	public String createDetail(Owner owner) {
		String message=null;
		ownerRepository.save(owner);
		if(owner!=null)
		{
			message="New customer details saved successfully!!";
		}
		else
		{
			message="customer details was not saved!!";
		}
		return message;
	}
	
}
