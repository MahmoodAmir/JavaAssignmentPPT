package javaAssignment4;

import java.util.Scanner;

public class Account {

	static double balance;
	static double amount;
	
	public static void deposit(double amount)
	{
		balance = balance + amount;
	}

	public static void withdraw(double amount) throws InsufficientBalanceException
	{
		if((balance - amount ) <= 0) {
			System.out.println("InSufficient Balance");
			throw new InsufficientBalanceException(" InSufficient Balance ");
		}
			
		balance = balance - amount;
	}
	
	public static void main(String[] args) throws InsufficientBalanceException  {
		
		Account act = new Account();
		try 
		{
			withdraw(amount);
			
		}
		catch (Exception e) 
		{
			withdraw(amount);
			System.out.println(e);
		}
		
//		  System.out.println(act.withdraw());
	

	}

}