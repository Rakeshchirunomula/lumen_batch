package com.training.ifaces;

public class Application {
	public static void print(Function conv,double arg) {
		if(conv instanceof Function) {
		System.out.println(((Function)conv).apply(arg));
	}
	}
	public static void main(String[] args) {
		CurrencyConverter currencyConv=new CurrencyConverter();
		print(currencyConv,100);
		TemperatureConverter tempConv=new TemperatureConverter();
		print(tempConv,34);
		
	}
	
}
