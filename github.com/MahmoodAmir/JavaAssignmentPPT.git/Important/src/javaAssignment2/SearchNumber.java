package javaAssignment2;
import java.util.Scanner;

public class SearchNumber {
	public static void main(String args[]) {
		int i,n, find;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of element you want in array");
		n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter all the Elements");
		for(i=0; i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter element to match");
		find = sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(a[i]==find) {
				System.out.println("this elements is present in array : "+find);
				System.out.println("position is : "+(i+1));
			}
			
		}

				
	}
}
