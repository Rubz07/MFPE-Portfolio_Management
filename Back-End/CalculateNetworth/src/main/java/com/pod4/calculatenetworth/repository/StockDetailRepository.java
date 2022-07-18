package com.pod4.calculatenetworth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pod4.calculatenetworth.model.StockDetail;

public interface StockDetailRepository extends JpaRepository<StockDetail, Integer> {
	public StockDetail findByStockName(String stockName);
}
