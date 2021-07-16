package com.example.cognizant;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import com.example.cognizant.controller.*;

 

@AutoConfigureMockMvc
@SpringBootTest
class CalculateNetworthApplicationTests {
	
    @Autowired
    private StockController controller;
    
    @Autowired
	 private MockMvc mvc;

    // STOCK CONTROLLER METHODS 
    
    @Test
    void contextLoads() {
        assertNotNull(controller);
    }
    /*
    @Test
    public void testGetAllAssets() throws Exception {
    	 ResultActions actions = mvc.perform(get("/GetAllAssets/101"));
        actions.andExpect(status().isOk()); 
    }*/
    /*
    @Test
    public void testGetAsset() throws Exception {
        ResultActions actions = mvc.perform(get("/calculateNetworth/101"));
        actions.andExpect(status().isOk());
    }
    */
    @Test
    public void testCalculateBalancePostSellPerStock() throws Exception {
        ResultActions actions = mvc.perform(post("/SellAssets/sampleTxt,2"));
        actions.andExpect(status().isNotFound());
    }
    
    ///SellAssets
    
}
     
    
