package com.example.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cognizant.model.ShareDetails;

@Repository
public interface ShareRepository extends JpaRepository<ShareDetails, String> {
	public ShareDetails findByShareId(String shareId);
}
