package assignproj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Main m = new Main();
	IApp ia;

	public static void main(String[] args) {
		Company com = new Company();
		System.out.println("company name------"+com.name);
		
		System.out.println("the available vehicles are");
		
		System.out.println(com.getCars().toString() + com.getTrucks().toString());

		m.getNextInput();
	}

	void getNextInput() { 
		
		System.out.println("do u want to deal with car or truck");
		Scanner sc = new Scanner(System.in);
		if (sc.next().equalsIgnoreCase("Car")) {
			ia = new Car();
			System.out.println("which fuction u want to perform:press 0:adding,1:delete,2:find");

			switch (sc.nextInt()) {
			case 0:
				ia.adding();
				m.getNextInput();
			case 1:
				ia.delete();
				m.getNextInput();
			case 2:
				System.out.println(ia.finding());
				m.getNextInput();
			case 3:
				ia.updating();
				m.getNextInput();
			default:
				System.exit(0);

			}
		}
		else {
			ia = new Truck();
			System.out.println("which fuction u want to perform:press 0:adding,1:delete,2:find");

			switch (sc.nextInt()) {
			case 0:
				ia.adding();
				m.getNextInput();

				break;
			case 2:
				ia.finding();
				m.getNextInput();
				break;

			default:
				System.exit(0);

			}
		}

	}
}