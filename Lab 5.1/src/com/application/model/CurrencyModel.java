package com.application.model;

public class CurrencyModel {

	
	public double convertJMDToUSD(double jmd) {
		return jmd/150.12;
	}
	
	public double convertUSDToJMD(double usd) {
		return usd * 150.12;
	}
}
