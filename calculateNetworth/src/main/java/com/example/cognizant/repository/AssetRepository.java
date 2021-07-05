package com.example.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cognizant.model.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer>{

	List<Asset> findByUserId(int userId);

}
