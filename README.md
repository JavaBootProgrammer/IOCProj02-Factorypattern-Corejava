# iocproj02-factorypattern-corejava

# Code

```Java
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
package com.vehicle.bike;

public interface Bike {

    public void start();

    public void drive();

    public void stop();

    public void park();
}
package com.vehicle.bike;

public class EletricBike implements Bike {

    @Override
    public void start() {
        System.out.println("EletricBike(Ather):: Bike Started");
    }

    @Override
    public void drive() {
        System.out.println("EletricBike(Ather):: Bike is in driving");

    }

    @Override
    public void stop() {
        System.out.println("EletricBike(Ather):: Bike is stopped");

    }

    @Override
    public void park() {
        System.out.println("EletricBike(Ather). Bike is parked");

    }

}
package com.vehicle.bike;

public class SportsBike implements Bike {

    @Override
    public void start() {
        System.out.println("SportsBike(KTM-Duke):: Bike STarted");
    }

    @Override
    public void drive() {
        System.out.println("SportsBike(KTM-Duke):: Bike is in driving");

    }

    @Override
    public void stop() {
        System.out.println("SportsBike(KTM-Duke):: Bike is stopped");

    }

    @Override
    public void park() {
        System.out.println("SportsBike(KTM-Duke). Bike is parked");

    }

}
package com.vehicle.bike;

public class StandardBike implements Bike {

    @Override
    public void start() {
        System.out.println("StandardBike(Honda-Shine):: Bike STarted");
    }

    @Override
    public void drive() {
        System.out.println("StandardBike(Honda-Shine):: Bike is in driving");

    }

    @Override
    public void stop() {
        System.out.println("StandardBike(Honda-Shine):: Bike is stopped");

    }

    @Override
    public void park() {
        System.out.println("StandardBike(Honda-Shine). Bike is parked");

    }

}
package com.vehicle.client;

import com.vehicle.bike.Bike;
import com.vehicle.factory.BikeFactory;

public class FactoryPatternTest1 {

    public static void main(String[] args) {
        //get Bike class object
        Bike bike1=BikeFactory.getBike("standard");
        bike1.start(); bike1.drive(); bike1.stop(); bike1.park();

        System.out.println("___________________");

        Bike bike2=BikeFactory.getBike("sports");
        bike2.start(); bike2.drive(); bike2.stop(); bike2.park();

    }

}
```

```logs
StandardBike(Honda-Shine):: Bike STarted
StandardBike(Honda-Shine):: Bike is in driving
StandardBike(Honda-Shine):: Bike is stopped
StandardBike(Honda-Shine). Bike is parked
___________________
SportsBike(KTM-Duke):: Bike STarted
SportsBike(KTM-Duke):: Bike is in driving
SportsBike(KTM-Duke):: Bike is stopped
SportsBike(KTM-Duke). Bike is parked```

# UML

![UML](src/main/resources/UML.png)
 
