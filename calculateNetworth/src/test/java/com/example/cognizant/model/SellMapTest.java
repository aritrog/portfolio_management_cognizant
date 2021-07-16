package com.example.cognizant.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SellMapTest {

	SellMap sellone=new SellMap();
	
	@Test
	void testSetStockIdList() {
		sellone.setStockIdList(null);
		assertEquals(null,sellone.getStockIdList());
	}

	@Test
	void testSetMfAssetList() {
		sellone.setMfAssetList(null);
		assertEquals(null,sellone.getMfAssetList());
	}

	@Test
	void testSellObjectMap() {
		SellMap sell=new SellMap();
	}

	

}