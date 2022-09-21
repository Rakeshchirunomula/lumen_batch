package com.training.ifaces;

public class TemperatureConverter implements Function {

	@Override
	public double apply(double arg) {
		// TODO Auto-generated method stub
		return 0.56*(arg-32);
	}
	
}
