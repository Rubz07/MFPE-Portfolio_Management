package com.pod4.DailySharePrice.exception;

public class StockNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public StockNotFoundException(String str) {
		super(str);
	}
}
