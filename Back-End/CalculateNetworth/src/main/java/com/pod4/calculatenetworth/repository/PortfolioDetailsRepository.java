package com.pod4.calculatenetworth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pod4.calculatenetworth.model.PortfolioDetails;

public interface PortfolioDetailsRepository extends JpaRepository<PortfolioDetails, Integer> {
	public PortfolioDetails findByPortfolioid(int id);

}
