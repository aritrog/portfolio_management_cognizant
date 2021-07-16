package com.example.cognizant.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class StockDetailsTest {
	StockDetails shareDetails=new StockDetails();
	
	@Test
	void testGetShareId() {
		shareDetails.setShareId("101");
		assertEquals("101", shareDetails.getShareId());
	}

	@Test
	void testGetShareValue1() {
		shareDetails.setShareValue(2000.0);
		assertEquals(2000.0, shareDetails.getShareValue());
	}

	@Test
	void testGetShareValue() {
		shareDetails.setShareValue(10.0);
		assertEquals(10.0, shareDetails.getShareValue());
	}
	

	@Test
	void testStockDetails() {
		StockDetails shareDetails=new StockDetails();
	}
}