package com.cognizant.jwtAuthorization.repository;

import com.cognizant.jwtAuthorization.model.UserData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserData,String> {
    
}
