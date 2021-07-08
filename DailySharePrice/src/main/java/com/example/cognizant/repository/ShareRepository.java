package com.example.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.cognizant.model.ShareDetails;

@Repository
public interface ShareRepository extends JpaRepository<ShareDetails, String> {
	
	
	public ShareDetails findByShareId(String shareId);
	
	

	 @Query("SELECT s FROM ShareDetails s WHERE s.shareId IN (:shareID) order by s.shareId")
	public List<ShareDetails> findByShareId(@Param("shareID") List<String> shareId);
	

}
