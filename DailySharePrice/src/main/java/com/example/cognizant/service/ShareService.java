package com.example.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cognizant.model.ShareDetails;
import com.example.cognizant.repository.ShareRepository;

@Service
public class ShareService {
	@Autowired
	private ShareRepository repository;
	
	public ShareDetails getSharebyId(String shareId){
		return repository.findByShareId(shareId);
	}
}
