import java.io.*;
import java.util.*;
class Bank
{
	String name;
	String add;
	int bal,deposit,withdrawl;
	Random r=new Random();
	long ac=r.nextInt(100000);
	Scanner sc=new Scanner(System.in);
	void userInput()
	{
	
		System.out.println("enter a name");
		name=sc.nextInt();
		System.out.println("enter address");
		add=sc.next();
	}
	void deposit()
	{
		System.out.println("enter current balance ");
		bal=sc.nextInt();
		System.out.println("enter deposit amount");
		deposit=sc.nextInt();
		bal+=deposit;
		
	}
	void withdrawl()
	{
		System.out.println("enter withdrawl amount");
		withdrawl=sc.nextInt();
		bal+=withdrawl;
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("A/c no. : "+ac);
		System.out.println("Address : "+add);
		System.out.println("Balance : "+bal);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Bank obj=new Bank();
		obj.userInput();
		System.out.println("press 1 to deposit");
		System.out.println("press 2 to withdrawl");
		System.out.println("press 3 to display details");
		System.out.println("press 4 to exit");
		int ch=sc.nextInt();
		
	}
}

