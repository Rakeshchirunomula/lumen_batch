package com.training;

import com.training.ifaces.Automobile;
import com.training.models.HyundaiCar;
import com.training.models.MarutiCar;
import com.training.models.ToyotoCar;

public class ShowRoom {
	
	
	public void printQuote(Automobile polyAuto) {
		
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getPrice());
		
	}
	
	
	public Automobile modelFactory(int key) {
		
		switch (key) {
		case 1:
			
			return new MarutiCar();
		case 2:
			return new ToyotoCar();
		case 3:
			return new HyundaiCar();
		default:
			return null;
		}
	}

}
