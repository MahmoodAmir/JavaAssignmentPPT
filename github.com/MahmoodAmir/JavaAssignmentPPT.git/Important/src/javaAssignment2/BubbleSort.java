package javaAssignment2;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element to insert in array : ");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		bubble(a);

	}

	static void bubble(int a[]) {
		int temp = 0;
		for (int j = 0; j < a.length; j++) {
			for (int k = j + 1; k < a.length; k++) {
				if (a[j] > a[k]) {
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}

			}
		}
		System.out.println("Sorted List is : ");

		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+"\t");
		}
	}
}
