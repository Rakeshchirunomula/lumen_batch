package com.training.models;

import com.training.ifaces.Automobile;

public class BmwCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Top_end";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 20000000;
	}

}
