package com.shopController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.Entity.Owner;
import com.shop.util.OwnerConverter;
import com.shopDTO.OwnerDTO;
import com.shopService.OwnerService;

@Controller
@RestController
@RequestMapping("/api")
public class ShopOwnerController {

	@Autowired
	private OwnerService ownerservice;
	@Autowired
	private OwnerConverter ownerConverter;
	
	@Postman("/createDetail")
	private String createDetail(@RequestBody OwnerDTO ownerDTO)
	{
		final Owner owner= ownerConverter.convertToOwnerEntity(ownerDTO);
		return ownerservice.createDetail(owner);
	}
	
	
}
