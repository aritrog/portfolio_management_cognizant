package com.example.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cognizant.model.MutualFundDetails;
import com.example.cognizant.repo.MutualFundRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MutualFundService {
	
	@Autowired
	private MutualFundRepository repo;
	
	@Transactional
	public MutualFundDetails getMutualFundByName(String mutualFundId) {
		return repo.findByMutualFundId(mutualFundId);
	}
	
	public List<Double> getMutualFundByIdList(List<String> mutualFundIdList) {
		List<Double> mfValueList = new ArrayList<>();
		List<MutualFundDetails> mfList=  repo.findByMutualFundId(mutualFundIdList);
		for(MutualFundDetails m:mfList) {
			mfValueList.add( m.getMutualFundValue());
		}
		log.info("fetching all the NAV...");
		return mfValueList;
	}
	
}
