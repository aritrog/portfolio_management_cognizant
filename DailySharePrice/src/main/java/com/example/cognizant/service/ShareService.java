package com.example.cognizant.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Double> getSharebyId(List<String> shareId) {
		List<Double> shareValueList = new ArrayList<>();
		List<ShareDetails> shareList=  repository.findByShareId(shareId);
		for(ShareDetails s:shareList) {
			shareValueList.add( s.getShareValue());
		}
		return shareValueList;
	}
	
	
}
