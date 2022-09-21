package com.training;
import com.training.ifaces.*;

public class PolymorphismApp {
	
	public static void main(String[] args) {
		ShowRoom saiCars= new ExclusiveShowRoom();
		Automobile auto=saiCars.modelFactory(Integer.parseInt(args[0]));
		saiCars.printQuote(auto);
		
	}
}
