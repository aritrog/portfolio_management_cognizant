package com.cognizant.portfolio.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.portfolio.Feign.CalculateNetworthFeignClient;
import com.cognizant.portfolio.model.Asset;
import com.cognizant.portfolio.model.SellObjectMap;
import com.cognizant.portfolio.model.UserData;
import com.cognizant.portfolio.service.WebportalService;

@Controller
public class PortalController {
	
	@Autowired
	WebportalService webportalService;
	
	@Autowired
	private CalculateNetworthFeignClient networthFeignClient;
	
	private static List<String> revokedTokens=new ArrayList<String>();

//	
//	@GetMapping("/home")
//	public String home() {
//	    return "Home";
//	}
//	
//	@GetMapping("/viewNetworth")
//	public String viewNetworth() {
//	    return "viewNetworth";
//	}
//	
//	@GetMapping("/sellAsset")
//	public String sellAsset() {
//	    return "sellAsset";
//	}
	
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView getLogin(HttpSession session) {
		
		if (session != null && (String) session.getAttribute("token") != null
				&& webportalService.isSessionValid((String) session.getAttribute("token"))&&!revokedTokens.contains((String) session.getAttribute("token"))) {
			
			return new ModelAndView("Home");
		}
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(path = "/alogin", method = RequestMethod.POST)
	public <user> ModelAndView postLogin(HttpSession session, ModelMap model, @ModelAttribute UserData user, ModelMap warning) {
		System.out.println(user.getUserid());
		System.out.println(user.getUpassword());
		System.out.println(user.toString());
		return new ModelAndView(webportalService.postLogin(user, session, warning));
	}
	
	

	@GetMapping("/Home")
	public ModelAndView getHomePage(HttpSession session) {
		
		if (webportalService.isSessionValid((String) session.getAttribute("token"))&&!revokedTokens.contains((String) session.getAttribute("token"))) {
			
			return new ModelAndView("Home");
		}
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public ModelAndView getLogout(HttpSession session) {
		if (session != null && (String) session.getAttribute("token") != null
				&& webportalService.isSessionValid((String) session.getAttribute("token"))) {
			revokedTokens.add((String) session.getAttribute("token"));
			return new ModelAndView("login");
		}
		return new ModelAndView("Home");
	}
	
	@RequestMapping(value ="/viewNetworth", method = RequestMethod.GET)
	public ModelAndView showNetworth(HttpSession session,ModelMap model) {
		
		if (webportalService.isSessionValid((String) session.getAttribute("token"))&&!revokedTokens.contains((String) session.getAttribute("token"))) {
			
			
			String s=(String)session.getAttribute("memberId");
			int i=Integer.parseInt(s);
			String token = (String)session.getAttribute("token");
			model.put("networth",networthFeignClient.getAsset(token,i));
			return new ModelAndView("viewNetworth");
		}
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/sellAsset", method = RequestMethod.GET)
	public ModelAndView showSupplyPage(HttpSession session,ModelMap model){
		
		if (webportalService.isSessionValid((String) session.getAttribute("token"))&&!revokedTokens.contains((String) session.getAttribute("token"))) {
			
			String s=(String)session.getAttribute("memberId");
			int i=Integer.parseInt(s);
			String token = (String)session.getAttribute("token");
			List<Asset> asset=networthFeignClient.getAllAssets(token,i);
			
			model.put("asset",asset);
			System.out.println(asset);
			return new ModelAndView("sellAsset");
		}
		
		return new ModelAndView("login");
	}
	
	
	@RequestMapping(path = "/viewNetworth", method = RequestMethod.POST)
	public <user> ModelAndView sellAssetsSelected(HttpSession session,@RequestParam("selected") String[] name,@RequestParam("quantity") String[] count,ModelMap model) {
		
		String s=(String)session.getAttribute("memberId");
		int i=Integer.parseInt(s);
//		display(name);
//		display(count);
		System.out.println("-----------------"+i);
		String token = (String)session.getAttribute("token");
		List<Asset> list=networthFeignClient.getAllAssets(token,i);
		SellObjectMap sell=webportalService.sellShares(list,i,name,count);
		Map<String,String> assetMap=webportalService.convertToMap(name,count);
		//LOGGER.info(map.toString());
		session.setAttribute("asset", convertoHashmap(list));
		model.put("networth",networthFeignClient.calculateBalancePostSellPerStock(token,sell));

		model.addAttribute("assetMap",assetMap);
		System.out.println("----------------------*******");
		System.out.println("name--->"+name.toString());
		System.out.println("list--->"+list);
		System.out.println("----------------------*******");
		System.out.println("assetmap-----"+assetMap.toString());
		return new ModelAndView("viewNetworth");
	}
	
	public HashMap<String,Asset> convertoHashmap(List<Asset> list){
		HashMap<String,Asset> a = new HashMap<>();
		
		for(int i=0; i<list.size(); i++) {
			a.put(list.get(i).getAssetId(), list.get(i));
		}
		
		return a;
		
	}	
//	public void display(String[] a) {
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//	}
	
	
	
}
