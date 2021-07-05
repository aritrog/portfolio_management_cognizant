package com.example.cognizant.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {
	@Id
	private String assetId;
	private int userId;
	private String assetName;
	private String assetType;
	private String units;
	
}
