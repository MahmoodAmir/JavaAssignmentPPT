package javaAssignment2;
import java.util.Scanner;

public class Grades {
	
	public static void checkGrades(int p, int c, int m) {
		if(p >=60 && c>=60 && m>=60) {
			System.out.println("Pass");
		}
		
		else if((p>=60 && c>=60 && m<=60) || (p>=60 && c<=60 && m>=60) || (p<=60 && c>=60 && m>=60)) {
			System.out.println("Promoted");
		}
		
		else if((p<=60 && c<=60 && m>=60) || (p<=60 && c>=60 && m<=60) || (p>=60 && c<=60 && m<=60) ) {
			System.out.println("Fail");
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p, c , m;
		System.out.println("Enter Marks of Physics : ");
		p = sc.nextInt();
		System.out.println("Enter marks of Chemistry : ");
		c = sc.nextInt();
		System.out.println("Enter marks of Maths : ");
		m = sc.nextInt();
		checkGrades(p,c,m);
	}
}



