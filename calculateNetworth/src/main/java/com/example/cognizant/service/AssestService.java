package com.example.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cognizant.model.Asset;
import com.example.cognizant.repository.AssetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class AssestService {

	Logger logger = LoggerFactory.getLogger(AssetRepository.class);
	@Autowired
	private AssetRepository repository;
	
	public List<Asset> getAllAssetForUser(int userId) {
	

		logger.info("In AssetService class ");
		 return repository.findByUserId(userId);
	}

	

}
