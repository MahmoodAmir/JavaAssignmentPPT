package javaAssignment6;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		PatientManager patientManager = new PatientManager();
		patientManager.start();
	}
}

class Patient implements Comparable<Patient> {

	private String name;
	private int priority;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Patient patient) {
		return (patient.priority - this.priority);
	}

	@Override
	public String toString() {
		return "\t" + name + "\n";
	}
}

class PatientManager {

	PriorityQueue<Patient> waitingList = new PriorityQueue<Patient>();

	public void start() {
		System.out.println("-----------------------------------------------------");
		System.out.println("(1) New Patient");
		System.out.println("(2) Next Patient");
		System.out.println("(3) Waiting List");
		System.out.println("(4) Exit");
		System.out.println("-----------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		int counter = 0;
		int choice = 0;
		int priority = 0;
		while (choice != 4) {
			try {
				System.out.print("* Choose an item from the menu: ");
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				choice = 0;
			}
			switch (choice) {
			case 1:
				System.out.print("\tEnter the patient's name: ");
				String name = sc.next();
				Patient patient = new Patient();
				patient.setName(name);
				priority = 0;
				System.out.print("\tEnter emergency [1 (low) to 5 (life-and-death): ");
				while (priority < 1 || priority > 5) {
					try {
						priority = sc.nextInt();
						if (0 < priority && 6 > priority) {
							patient.setPriority(priority);
							waitingList.add(patient);
							System.out.print("\tPatient added to waiting list.\n");
							counter++;
						} else {
							System.out.print("\t(X) Wrong value. Try again :");
						}
					} catch (InputMismatchException e) {
						System.out.print("\t(X) Wrong value. Try again :");
						sc.next();
					}

				}
				break;
			case 2:
				try {
					String name1 = waitingList.remove().getName();
					System.out.print("\t- " + name1 + " is treated\n");
					break;
				} catch (NoSuchElementException e) {
					System.out.println("\t- No more patients\n");
					break;
				}
			case 3:
				if (waitingList.isEmpty()) {
					System.out.print("\t- No patients in the list\n");
					break;
				} else {
					System.out.print("\tWaiting list includes : \n");
					for (Patient p : waitingList) {
						System.out.print("\t- " + p.getName() + "\n");
					}
				}
				break;
			case 4:
				choice = 4;
				System.out.println("Program is terminated. Good Bye!!");
				break;
			default:
				System.out.println("\t(X) Wrong choice.....\n");
				break;
			}
		}
		sc.close();
	}
}