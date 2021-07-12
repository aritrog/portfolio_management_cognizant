package com.example.cognizant.model;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MutualFundTest {
	
	MutualFundDetails mutualFund=new MutualFundDetails();
	
	@Test
	void testSetMutualFundId() {
		mutualFund.setMutualFundId("SBI");
		assertEquals("SBI", mutualFund.getMutualFundId());
	}

	@Test
	void testSetMutualFundValue() {
		mutualFund.setMutualFundValue(10.0);
		assertEquals(10.0, mutualFund.getMutualFundValue());
	}

	@Test
	void testToString() {
		MutualFundDetails mf=new MutualFundDetails("AXIS", 100.0);
		assertEquals("MutualFundDetails(mutualFundId=AXIS, mutualFundValue=100.0)", mf.toString());
	}

	@Test
	void testMutualFund() {
		MutualFundDetails mf=new MutualFundDetails();
	}

	@Test
	void testMutualFundStringStringDouble() {
		MutualFundDetails mf=new MutualFundDetails("DSP", 1000.0);
		assertEquals("DSP", mf.getMutualFundId());
		assertEquals(1000.0, mf.getMutualFundValue());
		
	}
}
