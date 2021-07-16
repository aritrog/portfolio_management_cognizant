package com.example.cognizant.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssetTest {

	Asset asset=new Asset();
	@Test
	void testSetAssetId() {
		asset.setAssetId("share1");
		assertEquals("share1",asset.getAssetId());
	}

	@Test
	void testSetUserId() {
		asset.setUserId(101);
		assertEquals(101,asset.getUserId());
	}
	
	@Test
	void testSetAssetName(){
		asset.setAssetId("JIO");
		assertEquals("JIO",asset.getAssetId());
	}

	@Test
	void testSetTypeForMutual() {
		asset.setAssetType("share");
		assertEquals("share",asset.getAssetType());
	}
	@Test
	void testSetTypeForShare() {
		asset.setAssetType("mutual");
		assertEquals("mutual",asset.getAssetType());
	}

	@Test
	void testSetUnits() {
		asset.setUnits("10");
		assertEquals("10",asset.getUnits());
	}


	@Test
	void testAsset() {
		Asset asset1=new Asset();
	}
}