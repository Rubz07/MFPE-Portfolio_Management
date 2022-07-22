package com.pod4.DailySharePrice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stocklist")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_id")
	private int stockId;
	@Column( name="stock_name", unique = true, nullable = false)
	private String stockName;
	@Column(name="stock_value")
	private double stockValue;
}
