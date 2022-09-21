package com.training.models;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Silky Silver";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "ciaz";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 900000;
	}

}
