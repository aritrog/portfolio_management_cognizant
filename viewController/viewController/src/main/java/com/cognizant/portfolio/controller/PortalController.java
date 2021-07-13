package com.cognizant.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PortalController {
	
	@GetMapping("/login")
	public String getLoginPage() {
			return "login";
	}
	
	@GetMapping("/home")
	public String home() {
	    return "Home";
	}
	
	@GetMapping("/viewNetworth")
	public String viewNetworth() {
	    return "viewNetworth";
	}
	
	@GetMapping("/sellAsset")
	public String sellAsset() {
	    return "sellAsset";
	}
	
	
	
	
//	@RequestMapping("/home")
//	public ModelAndView welcome() {
//	    ModelAndView modelAndView = new ModelAndView();
//	    modelAndView.setViewName("home");
//	    return modelAndView;
//	}
	
}
