package com.example.cognizant.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="DailyMutualFundNAV",url="http://localhost:9002")
public interface MutualFundDetailsFeign {
	
	
	@GetMapping("/dailyMutualFundNav/{mutualFundIdList}")
	public List<Double> getMutualDetailsById(@PathVariable(value="mutualFundIdList") List<String> mutualFundId);

}