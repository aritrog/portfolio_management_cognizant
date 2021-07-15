package com.cognizant.portfolio.model;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {
	
	private String assetId;
	
	private int userId;
	
	private String assetName;
	private String assetType;
	
	private int units;

}