package assignproj;

import java.util.ArrayList;
import java.util.Scanner;

public class Truck extends Vehicles implements IApp {
	Boolean isElectric = true;
	String size = "medium";
	ArrayList<Truck> trucks1;
	@Override
	public String toString() {
		return "Truck [isElectric=" + isElectric + "\n size=" + size + "\n trucks=" + trucks1 + "]\n";
	}

	public Truck(String size) {

		this.size = size;
	}

	Scanner sc = new Scanner(System.in);
Company c=new Company();
	public Truck() {

	}

	public boolean updating() {
		trucks1 = c.getTrucks();
		trucks1.set(sc.nextInt(), new Truck(sc.next()));
		System.out.println(trucks1);
		return false;
	}
	@Override
	public boolean adding() {
		trucks1 = c.getTrucks();
		System.out.println("enter the nu of trucks to be added");
		int n = sc.nextInt();
		System.out.println("enter the truck to be added with properties");
		for (int i = 0; i < n; i++) {
			trucks1.add(new Truck(sc.next()));
			return true;
		}
		return false;
	}

	@Override
	public Object finding() {
		trucks1 =c.getTrucks();
		System.out.println("enter the index of the car");
		return trucks1.get(sc.nextInt());
	}

	@Override
	public void delete() {
		trucks1 = c.getTrucks();
		trucks1.remove(sc.nextInt());
	}

}
