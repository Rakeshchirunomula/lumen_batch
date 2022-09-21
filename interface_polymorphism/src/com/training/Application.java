package com.training;

import com.training.ifaces.Function;

public class Application {

	public static void print(Object conv,double arg) {
		if(conv instanceof Function) {
		  System.out.println(((Function)conv).apply(arg));
		}
	}
	public static void main(String[] args) {

		CurrencyConverter currencyConv = new CurrencyConverter();
		
		print(currencyConv,100);
		
		TempratureConverter tempConv = new TempratureConverter();
		print(tempConv,34);
		
	}

}
