package com.example.cognizant.service;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cognizant.model.ShareDetails;
import com.example.cognizant.repository.ShareRepository;

@Service
public class ShareService {
	
	Logger logger = LoggerFactory.getLogger(ShareService.class);

	@Autowired
	private ShareRepository repository;
	
	public ShareDetails getSharebyId(String shareId){
		logger.info("In getSharebyId Method - ShareService class");

		return repository.findByShareId(shareId);
	}
	
	public List<Double> getSharebyId(List<String> shareId) {
		logger.info("In getSharebyId Method - ShareService class");

		List<Double> shareValueList = new ArrayList<>();
		List<ShareDetails> shareList=  repository.findByShareId(shareId);
		for(ShareDetails s:shareList) {
			shareValueList.add( s.getShareValue());
		}
		return shareValueList;
	}
	

	
	
}
