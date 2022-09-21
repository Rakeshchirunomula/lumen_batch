package com.training.models;

import com.training.ifaces.Automobile;

public class ToyotoCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Etios";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 15000000;
	}

}
