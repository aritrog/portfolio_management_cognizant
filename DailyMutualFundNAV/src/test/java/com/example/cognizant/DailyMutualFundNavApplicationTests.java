package com.example.cognizant;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@AutoConfigureMockMvc
@SpringBootTest
class DailyMutualFundNavApplicationTests {

	 @Autowired
	 private MockMvc mvc;

	 @Test
	 public void testGetDailySharePriceByID() throws Exception {
		 ResultActions actions = mvc.perform(get("/dailyMutualFundNav/DSP,SBI"));
	     actions.andExpect(status().isOk());
	        
	 }

}
