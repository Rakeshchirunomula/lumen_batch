package com.training;

import com.training.ifaces.Function;

public class TempratureConverter implements Function {

	@Override
	public double apply(double arg) {
		
		return (5*(arg-32))/9;
	}

}
