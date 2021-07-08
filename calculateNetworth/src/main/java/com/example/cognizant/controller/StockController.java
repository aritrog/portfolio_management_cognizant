package com.example.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cognizant.model.Asset;
import com.example.cognizant.service.AssestService;

@RestController
public class StockController {
	
	@Autowired
	private AssestService assetservice;
	
	@Autowired
	private ShareDetailsFiegn shareDetailsFiegn;
	
	@Autowired
	private MutualFundDetailsFeign mutualFundFeign;
	
	@GetMapping("/test")
	public String test() {
		return "DONE...READY";
	}
	
	@GetMapping("/GetAllAssets/{userId}")
	public List<Asset> getAllAssets(@PathVariable(value = "userId") int userId) {
		
			return assetservice.getAllAssetForUser(userId);
		
	}
	
	@GetMapping("/calculateNetworth/{userId}")
	public double getAsset(@PathVariable(value = "userId") int userId) 
	{
		double networth = 0.0;
		List<String> stockList = new ArrayList<>();
		List<String> mutualFundList = new ArrayList<>();
		List<Double> stockValueList = new ArrayList<>();
		List<Double> mutualFundValueList = new ArrayList<>();
		List<Asset> allAssets = assetservice.getAllAssetForUser(userId);
		
		for (Asset a : allAssets) {
			if (a.getAssetType().equals("share")) {
				stockList.add(a.getAssetId());
			} else {
				mutualFundList.add(a.getAssetId());
			}
		}
		
		if (!stockList.isEmpty()) {
			stockValueList = shareDetailsFiegn.finddailyShareById(stockList);
		}
		
		System.out.println("***********************"+stockList);
		System.out.println("***********************//////"+stockValueList);
		
		if (!mutualFundList.isEmpty()) {
			mutualFundValueList = mutualFundFeign.getMutualDetailsById(mutualFundList);
		}
		System.out.println("***********************"+mutualFundList);
		System.out.println("***********************//////"+mutualFundValueList);
		
		
		
		
		
		return networth;
	}
	
	
}
