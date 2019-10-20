package javaAssignment4;

public class ExceptionTesting {

	public static void main(String[] args) {

//		*************************try with multiple catch*************************
//		try {
//			int arr[] = new int[10];
//			System.out.println(arr[12]);
//		}
//
//		catch (ArithmeticException e) {
//			System.out.println("Arithmetic Exception will run");
//		}
//
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBounds Exception will run");
//		}
//
//		catch (Exception e) {
//			System.out.println("Exception will run");
//		}
//
//		System.out.println("This line of code should be run");
		
		

//		*************************Nested try/catch block*************************		
		try {
//			System.out.println("divide.....11111111");
//			int b = 50/0;
			
			
			try {
				System.out.println("divide");
				int a = 10/0;
			}
			
			catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int a[] = new int[5];
				a[4] = 4;
			}

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("It should run properly");

		}

		catch (ArithmeticException  e) {
			System.out.println("handeled : "+e);
		}

		System.out.println("Rest of the code..!!");
		
		
//		*************************try,catch and finally block*************************		
//		try {
//			int a = 25 / 0;
//			System.out.println(a);
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("finally block will always execute");
//		}
//		System.out.println("Rest of the code...!!");
		
		
//		*************************try,catch and finally block*************************
//		try {
//			int a = 25 / 0;
//			System.out.println(a);
//		}  finally {
//			System.out.println("finally block will always execute");
//		}
//		System.out.println("rest of the code...!!");

	
	}
}