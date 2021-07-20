package com.example.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cognizant.model.ShareDetails;
import com.example.cognizant.service.ShareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ShareController {
	Logger logger = LoggerFactory.getLogger(ShareController.class);

	@Autowired
	private ShareService service;
	
	
	
	@GetMapping("/dailySharePrice/name/{shareId}")
	public ShareDetails getDailySharePrice(@PathVariable String shareId){
		logger.info("In getDailySharePrice Method - ShareController");

			return service.getSharebyId(shareId);

	}
	
	@GetMapping("/dailySharePrice/{shareId}")
	public List<Double> getDailySharePriceByIDList(@PathVariable(value="shareId") List<String> shareId){
		logger.info("In getDailySharePriceByIDList Method - ShareController");

			return service.getSharebyId(shareId);
		
	}
}
