package com.example.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cognizant.model.MutualFundDetails;
import com.example.cognizant.service.MutualFundService;

@RestController
public class MutualFundController {
	
	@Autowired
	private MutualFundService service;
	
	
	@GetMapping("/dailyMutualFundNav/name/{mutualFundName}")
	public MutualFundDetails getDailyMutualFundNav(@PathVariable String mutualFundName) {
		return service.getMutualFundByName(mutualFundName);
	}
	
}
