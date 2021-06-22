package com.application.controller;

import com.application.model.CurrencyModel;
import com.application.view.CurrencyView;

public class CurrencyController {

	private CurrencyModel currencyModel;
	private CurrencyView currencyView;
	
	public void convert(String convertTo, String value) {
		if(convertTo == "JMD") {
			currencyView.updateResult(Double.toString(currencyModel.convertUSDToJMD(Double.parseDouble(value))));
		}
		if(convertTo == "USD") {
			currencyView.updateResult(Double.toString(currencyModel.convertJMDToUSD(Double.parseDouble(value))));
		}
		
	}
	
	public CurrencyController() {
		currencyModel = new CurrencyModel();
		currencyView = new CurrencyView(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CurrencyController();
	}

}
