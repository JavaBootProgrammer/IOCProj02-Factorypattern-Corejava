//BikeFactory.java (factory Pattern)
package com.vehicle.factory;

import com.vehicle.bike.Bike;
import com.vehicle.bike.EletricBike;
import com.vehicle.bike.SportsBike;
import com.vehicle.bike.StandardBike;

public class BikeFactory {

	 //static factory method having factory pattern logic
	public static   Bike    getBike(String type) {
		  //create and  return one of Bike class obj  based on given data
		 if(type.equalsIgnoreCase("standard"))
			 return new StandardBike();
		 else if(type.equalsIgnoreCase("sports"))
			 return new SportsBike();
		 else if(type.equalsIgnoreCase("eletric"))
			 return  new EletricBike();
		 else
			 throw  new IllegalArgumentException("Invalid bike type");
	}
}
