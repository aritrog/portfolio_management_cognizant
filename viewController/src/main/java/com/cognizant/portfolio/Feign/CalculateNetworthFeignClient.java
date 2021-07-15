package com.cognizant.portfolio.Feign;
import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.portfolio.model.Asset;
import com.cognizant.portfolio.model.SellObjectMap;





@FeignClient(name="CalculateNetworth",url="http://localhost:9003" )
public interface CalculateNetworthFeignClient {
	
	@GetMapping("calculateNetworth/{id}")
	public double getAsset(@RequestHeader("Authorization") String token,@PathVariable(value="id") int id);
	
	@GetMapping("/GetAllAssets/{id}")
	public List<Asset> getAllAssets(@RequestHeader("Authorization") String token,@PathVariable(value="id") int id);
	
	@PostMapping("SellAssets")
	public double calculateBalancePostSellPerStock(@RequestHeader("Authorization") String token,@RequestBody SellObjectMap sell);
}