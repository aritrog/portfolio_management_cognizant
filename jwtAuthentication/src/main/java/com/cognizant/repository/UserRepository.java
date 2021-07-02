package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.MyUser;



public interface UserRepository extends JpaRepository<MyUser,String > {

	public MyUser findByUsername(String username);

	

}
