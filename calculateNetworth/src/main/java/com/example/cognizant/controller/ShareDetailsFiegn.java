package com.example.cognizant.controller;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.cognizant.model.StockDetails;



@FeignClient(name="DailySharePrice",url="http://localhost:9001")
public interface ShareDetailsFiegn {
	
	@GetMapping("/dailySharePrice/{shareId}")
	public List<Double> finddailyShareById(@PathVariable(value="shareId")List<String> stockList);
}
