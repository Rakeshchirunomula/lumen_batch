package com.training;

import com.training.ifaces.Automobile;

public class PolymorhismApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowRoom saiCars = new ShowRoom();
		
		Automobile auto = saiCars.modelFactory(Integer.parseInt(args[0]));
		  
		  saiCars.printQuote(auto);
		  
		  

	}

}
