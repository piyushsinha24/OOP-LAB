import java.util.*;
class Employee1
{
	String name;
	int id;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your id");
		id=sc.nextInt();
		
	}
	void showData()
	{
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
	}
}
class Scientist extends Employee1
{
	int no_of_publication;
	float experience;
	void getData()
	{
		super.getData();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of publications");
		no_of_publication=sc.nextInt();
		System.out.println("Enter your experience");
		experience=sc.nextFloat();
	}
	void showData()
	{
		super.showData();
		System.out.println("No.of Publications :"+no_of_publication);
		System.out.println("Experience :"+experience);
	}
	
}
class DScientist extends Scientist
{
	String award;
	void getData()
	{
		super.getData();		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter awards won");
		award=sc.next();
	}
	void showData()
	{
		super.showData();
		System.out.println("Awards :"+award);
	}
}
class Employee
{
	public static void main(String [] args)
	{
		DScientist dsct=new DScientist();
		dsct.getData();
		dsct.showData();
	}
}
