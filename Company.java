package assignproj;

import java.util.ArrayList;
import java.util.List;

public class Company {
String name="telsa";
List<Vehicles> vehicles;

public Company() {
	this.vehicles=new ArrayList<Vehicles>();
}
ArrayList<Car> cars ;//= new ArrayList<Car>();
ArrayList<Truck> trucks ;//= new ArrayList<Truck>();

public ArrayList<Car> getCars() {
	cars=new ArrayList<Car>();
	cars.add(new Car("bmw"));
	cars.add(new Car("benz"));
	cars.add(new Car("audi"));
	return cars;
}
public ArrayList<Truck> getTrucks() {
	trucks=new ArrayList<Truck>();
	trucks.add(new Truck("tata"));
	trucks.add(new Truck("ashoka"));
	trucks.add(new Truck("mahindra"));
	
	return trucks;
}

}

