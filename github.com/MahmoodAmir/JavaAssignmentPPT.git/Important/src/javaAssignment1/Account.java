package javaAssignment1;
import java.util.Scanner;

class Bank
{
	private String accountno;
	private String name;
	private long balance;

	Scanner sc = new Scanner(System.in);
	
	void openAccount()
	{ 
		System.out.print("Enter Account No : ");
		accountno = sc.next();
		System.out.print("Please Enter the Name : ");
		name = sc.next();
		System.out.print("Enter the Balance: ");
		balance = sc.nextLong();
	}

	void showAccount()
	{ 
		System.out.println(accountno + " , " + name + " , " + balance);
	}

	void deposit()
	{
		long amount;
		System.out.println("Enter Amount you Want to Deposit : ");
		amount = sc.nextLong();
		balance=balance + amount;
	}

	void withdrawal()
	{
		long amount;
		System.out.println("Enter Amount you Want to withdraw : ");
		amount = sc.nextLong();
		if(balance>=amount)
		{ 
			balance=balance - amount;
		}
		else
		{
			System.out.println("Insufficient Balance..");
		}
	}

	boolean search(String acno)
	{ 
		if(accountno.equals(acno))
		{
			showAccount();
			return(true);
		}
		return(false);
	}
}

class Account
{  
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		//create initial accounts
		System.out.print("How Many Customer you Want to add : ");
		int n = sc.nextInt();
		Bank  cust[] = new Bank[n];
		for(int i=0;i<cust.length;i++)
		{   
			cust[i] = new Bank();
			cust[i].openAccount();
		}
		
		int choice;
		do
		{
			System.out.println("Main Menu\n 1.Display All\n 2.Search By Account\n 3.Deposit\n 4.Withdrawal\n 5.Exit");
			System.out.println("Ur Choice :");
			choice = sc.nextInt();
			switch(choice)
			{ 
				case 1:
					for(int i=0;i<cust.length;i++)
					{
						cust[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account No you Want to Search...: ");
					String acno = sc.next();
					boolean found = false;
					for(int i=0;i<cust.length;i++)
					{  
						found=cust[i].search(acno);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account does Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acno = sc.next();
					found=false;
					for(int i=0;i<cust.length;i++)
					{  
						found = cust[i].search(acno);
						if(found)
						{
							cust[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account does Not Exist..");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					acno = sc.next();
					found=false;
					for(int i=0;i<cust.length;i++)
					{  
						found=cust[i].search(acno);
						if(found)
						{
							cust[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account does Not Exist..");
					}
					break;

				case 5:
					System.out.println("Thank you...!! System Exit.");
					break;
			}
		}
		while(choice!=5);
	}
}