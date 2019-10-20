package javaAssignment2;
import java.util.Scanner;

public class CUILogin {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String username;
		String password;
		int login = 0;
			for(int i=0;i<=2;i++) {
				System.out.println("Enter User name");
				username = sc.next();
				System.out.println("Enter Password");
				password = sc.next();
				
				if(username.equals("Amir") && password.equals("Amir123")) {
					System.out.println("Welcome : "+username);
					i=3;
					login = 1;
				}	
		}
			if(login==0)
			System.out.println("Incorrect Password/Username...!! Contact Admin");
	}
		
}
