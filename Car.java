package assignproj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car extends Vehicles implements IApp {
	private String model;

	String gears = "automatic";
	Boolean cellphoneChargr = true;
	Boolean acNonAc = true;
	ArrayList<Car> cars1;
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car() {
		
	}
	
	Company c = new Company();
	Scanner sc = new Scanner(System.in);
	

	public boolean adding() {
		cars1 = c.getCars();
		System.out.println("enter the nu of cars to be added");
		int n = sc.nextInt();
		System.out.println("enter the car to be added with properties");
		for (int i = 0; i < n; i++) {
			cars1.add(new Car(sc.next()));
			System.out.println("added successfully\n");
			for (Car car : cars1) {
				System.out.println(car);
			}
			return true;
		}
		return false;
	}
	

	@Override
	public boolean updating() {
		cars1 = c.getCars();
		cars1.set(sc.nextInt(), new Car(sc.next()));
		System.out.println(cars1);
		return false;
	}

	@Override
	public Object finding() {
		cars1 = c.getCars();
		System.out.println("enter the index of the car");
		return cars1.get(sc.nextInt());
	
	}

	@Override
	public void delete() {
		cars1 = c.getCars();
		cars1.remove(sc.nextInt());

	}
	@Override
	public String toString() {
		return "Car [model=" + model + "\n gears=" + gears + "\n cellphoneChargr=" + cellphoneChargr + "\n acNonAc="
				+ acNonAc + "\n cars1=" + cars1 + "\n ]";
	}

}
