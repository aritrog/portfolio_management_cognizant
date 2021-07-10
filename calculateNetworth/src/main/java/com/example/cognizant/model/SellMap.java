package com.example.cognizant.model;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellMap {

	int id;

	Map<String,Integer> stockIdList;

	Map<String,Integer> mfAssetList;


}