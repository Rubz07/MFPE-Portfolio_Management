package com.pod4.calculatenetworth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pod4.calculatenetworth.model.MutualFund;

public interface MutualFundRepository extends JpaRepository<MutualFund, Integer> {
	public MutualFund findByMutualFundName(String mfname);
}
