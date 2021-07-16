package com.example.cognizant.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MutualFundDetailsTest {

	MutualFundDetails mutualFund=new MutualFundDetails();
	@Test
	void testSetMutualFundId() {
		mutualFund.setMutualFundId("101");
		assertEquals("101", mutualFund.getMutualFundId());
	}

	@Test
	void testSetMutualFundValue() {
		mutualFund.setMutualFundValue(2500.0);
		assertEquals(2500.0, mutualFund.getMutualFundValue());
	}

	@Test
	void testSetMutualFundValue2() {
		mutualFund.setMutualFundValue(2000.0);
		assertEquals(2000.0, mutualFund.getMutualFundValue());
	}

	@Test
	void testMutualFundDetails() {
		MutualFundDetails mfd=new MutualFundDetails();
	}

}