package com.example.cognizant.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.cognizant.model.Asset;
import com.example.cognizant.model.SellMap;
import com.example.cognizant.service.AssestService;
import com.example.cognizant.service.SellAssetService;

@RestController
public class StockController {
	Logger logger = LoggerFactory.getLogger(StockController.class);
	
	@Autowired
	private AssestService assetservice;
	
	@Autowired
	private ShareDetailsFiegn shareDetailsFiegn;
	
	@Autowired
	private MutualFundDetailsFeign mutualFundFeign;
	
	@Autowired
	private SellAssetService sellService;
	
	@GetMapping("/test")
	public String test() {
		logger.info("In StockController Class at test() method");
		return "DONE...READY";
	}
	
	@GetMapping("/GetAllAssets/{userId}")
	public List<Asset> getAllAssets(@RequestHeader("Authorization") String token,@PathVariable(value = "userId") int userId) {
		logger.info("In StockController Class at getAllAssets() method");
		if(sellService.isSessionValid(token)) {
			return assetservice.getAllAssetForUser(userId);
		}
		return null;
	}
	
	@GetMapping("/calculateNetworth/{userId}")
	public double getAsset(@RequestHeader("Authorization") String token,@PathVariable(value = "userId") int userId) 
	{
		logger.info("In StockController Class at getAsset() method");
		double networth = 0.0;
		if(sellService.isSessionValid(token)) {
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
		if (!mutualFundList.isEmpty()) {
			mutualFundValueList = mutualFundFeign.getMutualDetailsById(mutualFundList);
		}
		int stockCounter = 0, mfCounter = 0;
		for (Asset a : allAssets) {
			if (a.getAssetType().equals("share")) {
				networth += Integer.parseInt(a.getUnits())  * stockValueList.get(stockCounter);
				stockCounter++;
			} else {
				networth += Integer.parseInt(a.getUnits()) * mutualFundValueList.get(mfCounter);
				mfCounter++;
			}
		}
		
		}
		return networth;
	}
	
	@PostMapping("/SellAssets")
	public double calculateBalancePostSellPerStock(@RequestHeader("Authorization") String token,@RequestBody SellMap sell) {
		logger.info("In StockController Class at calculateBalancePostSellPerStock() method");
		if(sellService.isSessionValid(token)) {
		Map<String, Integer> stockIdList = sell.getStockIdList();
		Map<String, Integer> mfIdList = sell.getMfAssetList();
		if (!stockIdList.isEmpty()) {
			sellService.deleteStockAssetWithUnits(sell.getPid(), stockIdList);
		}
		if (!mfIdList.isEmpty()) {
			sellService.deleteMutualFundAssetWithUnits(sell.getPid(), mfIdList);
		}
		}
		return getAsset(token,sell.getPid());
	}
	
	
}
