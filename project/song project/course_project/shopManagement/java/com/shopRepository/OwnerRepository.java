package com.shopRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.Entity.Owner;



public interface OwnerRepository extends JpaRepository<Owner, Integer>{ 

}

