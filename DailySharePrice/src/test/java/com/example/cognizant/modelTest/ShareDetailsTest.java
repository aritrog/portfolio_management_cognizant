package com.example.cognizant.modelTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.cognizant.model.ShareDetails;


class ShareDetailsTest {

	ShareDetails shareDetails=new ShareDetails();
	@Test
	void testGetShareId() {
		shareDetails.setShareId("share1");
		assertEquals("share1", shareDetails.getShareId());
	}


	@Test
	void testGetShareValue() {
		shareDetails.setShareValue(1500.0);
		assertEquals(1500.0, shareDetails.getShareValue());
	}
	
	@Test
	void testShareDetailsStringStringDouble() {
		ShareDetails shareDetails=new ShareDetails("share1",2000.0);
		assertEquals("share1", shareDetails.getShareId());
		assertEquals(2000.0, shareDetails.getShareValue());
	}

}