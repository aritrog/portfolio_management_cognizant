package com.example.cognizant.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cognizant.model.MutualFundDetails;

@Repository
public interface MutualFundRepository extends JpaRepository<MutualFundDetails, String> {

	
	public MutualFundDetails findByMutualFundId(String mutualFundId);
	
}
