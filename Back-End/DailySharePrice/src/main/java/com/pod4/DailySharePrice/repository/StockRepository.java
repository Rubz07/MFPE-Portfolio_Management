package com.pod4.DailySharePrice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pod4.DailySharePrice.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	public Stock findByStockName(String stockName);
}
