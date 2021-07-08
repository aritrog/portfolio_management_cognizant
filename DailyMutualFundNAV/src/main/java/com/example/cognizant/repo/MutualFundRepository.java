package com.example.cognizant.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.cognizant.model.MutualFundDetails;

@Repository
public interface MutualFundRepository extends JpaRepository<MutualFundDetails, String> {

	
	public MutualFundDetails findByMutualFundId(String mutualFundId);
	
	 @Query("SELECT m FROM MutualFundDetails m WHERE m.mutualFundId IN (:mutualFundIdList) order by m.mutualFundId")
		public List<MutualFundDetails> findByMutualFundId(@Param("mutualFundIdList") List<String> mutualFundIdList);
	
}
