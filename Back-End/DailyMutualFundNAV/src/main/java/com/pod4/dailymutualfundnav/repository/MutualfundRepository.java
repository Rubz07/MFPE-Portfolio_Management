package com.pod4.dailymutualfundnav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pod4.dailymutualfundnav.model.MutualFund;

public interface MutualfundRepository extends JpaRepository<MutualFund, Integer> {
	public List<MutualFund> findAll();
	public MutualFund findByMutualFundName(String mutualFundName);
}
