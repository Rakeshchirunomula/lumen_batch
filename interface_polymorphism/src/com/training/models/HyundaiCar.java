package com.training.models;

import com.training.ifaces.Automobile;

public class HyundaiCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i20";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1400000;
	}

}
