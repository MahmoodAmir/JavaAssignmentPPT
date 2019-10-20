package javaAssignment3;

import java.util.Scanner;

class Candy extends DessertItem {
	int tax = 10;
	int dollar = 60;

	@Override
	int getCost() {
		int getCost = (tax * dollar) / 100;
		int cost = getCost + dollar;
		return cost;
	}
}

class Cookie extends DessertItem {
	int tax = 10;
	int euro = 70;

	@Override
	int getCost() {
		int getCost = (tax * euro) / 100;
		int cost = getCost + euro;
		return cost;

	}
}

class IceCream extends DessertItem {
	int tax = 10;
	int rupee = 50;

	@Override
	int getCost() {
		int getCost = (tax * rupee) / 100;
		int cost = getCost + rupee;
		return cost;
	}
}

public abstract class DessertItem {
	abstract int getCost();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 2) {

			System.out.println("Enter your Role :\t 1- Owner\t 2- Customer");
			int role = sc.nextInt();

			if (role == 1) {

				System.out.println("Please enter the desert you want to Add");
				String dItems = sc.next();

				if (dItems.toUpperCase().equals("CANDY")) {
					System.out.println("Candy has been added to Storage");
				} else if (dItems.toUpperCase().equals("COOKIE")) {
					System.out.println("Cookie has been added to Storage");
				} else if (dItems.toUpperCase().equals("ICECREAM")) {
					System.out.println("IceCream has been added to Storage");
				} else
					System.err.println("Enter a Valid item");
				System.out.println("Do you wish to continue...? YES/NO");
				String status = sc.next();
				if (status.toUpperCase().equals("NO")) {
					System.out.println("Thank yoou");
					choice = 2;
				}
				else {
					System.out.println("Continue....");
				}
			} else {
				System.out.println("Please enter the order to place");
				String pOrder = sc.next();
				if (pOrder.toUpperCase().equals("CANDY")) {
					System.out.println("The price for one Candy is 1 Doller");
					System.out.println("Enter the no of Candy you want to order");
					int n = sc.nextInt();
					DessertItem di = new Candy();
					System.out.println("Total cost for " + n + " Candy is : " + n * di.getCost() + " INR");
				} else if (pOrder.toUpperCase().equals("COOKIE")) {
					System.out.println("The price for one Cookie is 1 Euro");
					System.out.println("Enter the no of Cookie you want to order");
					int n = sc.nextInt();
					DessertItem di = new Cookie();
					System.out.println("Total cost for " + n + " Cookie is : " + n * di.getCost() + " INR");
				} else if (pOrder.toUpperCase().equals("ICECREAM")) {
					System.out.println("The price for one Icecream is 50 Rupees");
					System.out.println("Enter the no of IceCream you want to order");
					int n = sc.nextInt();
					DessertItem di = new IceCream();
					System.out.println("Total cost for " + n + " IceCream is : " + n * di.getCost() + " INR");
				}
				System.out.println("Do you wish to continue...? YES/NO");
				String status = sc.next();
				if (status.toUpperCase().equals("NO"))
					choice = 2;
				else {
					System.out.println("Continue....");
				}
			}

		}
		

	}
}
