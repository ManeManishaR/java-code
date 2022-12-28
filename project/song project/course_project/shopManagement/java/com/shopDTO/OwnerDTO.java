package com.shopDTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OwnerDTO {

	 @SuppressWarnings("unused")
	private int id;
	 @NotNull
	  @Size(min=1)
	
	private String shop_name;
	 @NotNull
	  @Size(min=1)
	 private String city;
	 @NotNull
	  @Size(min=1)
	 private String stock;
	 @NotNull
	  @Size(min=1,max =10)
	 private int price;
	
}
