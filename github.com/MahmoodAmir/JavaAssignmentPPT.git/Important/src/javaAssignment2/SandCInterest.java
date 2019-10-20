package javaAssignment2;
import java.util.Scanner;

public class SandCInterest {
		
		
		public static float SimpleInterest(float principle, float rate, float time) {
			float simpleInterest = (principle*rate*time)/100;
			return simpleInterest;
		}
		
		public static float CompoundInterest(float principle, float rate, float time, float n) {
			double amount = principle * Math.pow(1 + (rate / n), n * time);
			double compoundInterest = amount - principle;
			return (float) compoundInterest;
		}
		

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Principle amount : ");
			float principle = sc.nextFloat();
			
			System.out.println("Enter the annual rate");
			float rate = sc.nextFloat();
			
			System.out.println("Enter the time in years");
			float time = sc.nextFloat();
			
			int n =12;

			SandCInterest s1 = new SandCInterest();
			SandCInterest s2 = new SandCInterest();
			System.out.println("Simple Interest is : "+s1.SimpleInterest(principle, rate, time));
			System.out.println("Compound Interest is : "+s2.CompoundInterest(principle, rate, time, n));

		}

}
