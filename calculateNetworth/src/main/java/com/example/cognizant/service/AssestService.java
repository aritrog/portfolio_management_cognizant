package com.example.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cognizant.model.Asset;
import com.example.cognizant.repository.AssetRepository;

@Service
public class AssestService {

	@Autowired
	private AssetRepository repository;
	
	public List<Asset> getAllAssetForUser(int userId) {
	
		 return repository.findByUserId(userId);
	}

	

}
