package com.example.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cognizant.model.MutualFundDetails;
import com.example.cognizant.service.MutualFundService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MutualFundController {
	
	@Autowired
	private MutualFundService service;
	
	
	@GetMapping("/dailyMutualFundNav/name/{mutualFundName}")
	public MutualFundDetails getDailyMutualFundNav(@PathVariable String mutualFundName) {
		log.info("fetching Mutual fund details of the given Fund ID...");
		return service.getMutualFundByName(mutualFundName);
	}
	
	@GetMapping("/dailyMutualFundNav/{mutualFundId}")
	public List<Double> getDailyMutualFundNavById(@PathVariable(value="mutualFundId") List<String> mutualFundIdList) {
		
			return service.getMutualFundByIdList(mutualFundIdList);
		
		
	}
}
