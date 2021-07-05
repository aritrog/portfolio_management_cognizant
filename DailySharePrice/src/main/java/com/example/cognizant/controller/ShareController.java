package com.example.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.cognizant.model.ShareDetails;
import com.example.cognizant.service.ShareService;

@RestController
public class ShareController {
	
	@Autowired
	private ShareService service;
	
	
	
	@GetMapping("/dailySharePrice/name/{shareId}")
	public ShareDetails getDailySharePrice(@PathVariable String shareId){

			return service.getSharebyId(shareId);

	}
}
