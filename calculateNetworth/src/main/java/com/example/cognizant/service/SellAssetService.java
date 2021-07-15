package com.example.cognizant.service;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cognizant.controller.AuthClient;
import com.example.cognizant.model.Asset;
import com.example.cognizant.model.AuthResponse;
import com.example.cognizant.repository.AssetRepository;


@Service
public class SellAssetService {
	
	@Autowired
	private AssetRepository repository;
	
	@Autowired
	private AuthClient authClient;
	
	public void deleteStockAssetWithUnits(int Id,Map<String,Integer> idList) {
		for(String id:idList.keySet()) {
		Asset a = repository.findByUserIdAndAssetIdAndAssetType(Id,id,"share");
		int units=Integer.parseInt(a.getUnits())-idList.get(id);
//		String sunits = Integer.toString(units);
		if(units>0) {
			a.setUnits(Integer.toString(units));
			repository.save(a);
		}
		else {
			repository.delete(a);
		}
		}
	}
	
	public void deleteMutualFundAssetWithUnits(int Id,Map<String, Integer> mfIdList) {
		for(String id:mfIdList.keySet()) {
			Asset a = repository.findByUserIdAndAssetIdAndAssetType(Id,id,"mutual");
			int units=Integer.parseInt(a.getUnits())-mfIdList.get(id);
			if(units>0) {
				a.setUnits(Integer.toString(units));
				repository.save(a);
			}
			else {
				repository.delete(a);
			}
			}
	}
	
	public Boolean isSessionValid(String token) {
		try {
			AuthResponse authResponse = authClient.getValidity(token);
		} catch (Exception e) {
			return false;
		} 
		return true;
	}
}