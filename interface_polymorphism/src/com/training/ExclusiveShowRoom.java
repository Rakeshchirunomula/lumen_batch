package com.training;
import com.training.models.*;

import com.training.ifaces.Automobile;

public class ExclusiveShowRoom extends ShowRoom {

	@Override
	public Automobile modelFactory(int key) {
		// TODO Auto-generated method stub
		if(key==4) {
			return new BmwCar();
		}
		return super.modelFactory(key);
	}

	
}