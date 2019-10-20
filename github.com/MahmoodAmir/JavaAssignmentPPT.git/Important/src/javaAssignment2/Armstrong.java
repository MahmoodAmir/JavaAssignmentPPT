package javaAssignment2;
import java.util.Scanner;

class Armstrong {
	public static void main(String[] args)  {  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int c=0,a;
		int temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			}
		
		if(temp==c)
			System.out.println("It is a Armstrong number");
		else
			System.out.println("Its is Not a armstrong number");
		}
	}