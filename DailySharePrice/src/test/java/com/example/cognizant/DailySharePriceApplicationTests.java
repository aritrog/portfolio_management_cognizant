package com.example.cognizant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.cognizant.controller.ShareController;


@AutoConfigureMockMvc
@SpringBootTest
class DailySharePriceApplicationTests {
	
	@Autowired
    private ShareController shareController;
	
	 @Autowired
	 private MockMvc mvc;

	  @Test
	    public void testGetDailySharePriceByID() throws Exception {
	        ResultActions actions = mvc.perform(get("/dailySharePrice/share1,share2"));
	        actions.andExpect(status().isOk());
	        
	    }

}
