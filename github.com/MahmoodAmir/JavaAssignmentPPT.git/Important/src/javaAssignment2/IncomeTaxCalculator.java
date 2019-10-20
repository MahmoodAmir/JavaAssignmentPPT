package javaAssignment2;
import java.util.Scanner;

public class IncomeTaxCalculator {
	
	static void taxCal(int salary) {
		int tax;
		if(salary>0 && salary<=180000) {
			System.out.println("You belongs to SLAB A");
			System.out.println("No need to pay tax");
		}
		
		else if(salary>=180001 && salary<=300000) {
			tax = (salary*10)/100;
			System.out.println("You belongs to SLAB B");
			System.out.println("You have to pay tax Rs. : "+tax);			
		}
		
		else if(salary>=300001 && salary<=500000) {
			tax = (salary*20)/100;
			System.out.println("You belongs to SLAB C");
			System.out.println("You have to pay tax Rs. : "+tax);			
		}
		
		else if(salary>=500001 && salary<=1000000) {
			tax = (salary*30)/100;
			System.out.println("You belongs to SLAB D");
			System.out.println("You have to pay tax Rs. : "+tax);			
		}
		
		else if(salary>=1000000 ) {
			tax = (salary*40)/100;
			System.out.println("You belongs to SLAB E");
			System.out.println("You have to pay tax Rs. : "+tax);			
		}
				
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter your Salary : ");
		int salary = sc.nextInt();
	 	taxCal(salary);	
	}

}
