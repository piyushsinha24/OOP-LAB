import java.io.*;
import java.util.*;
class Student
{
	int id,sem;
	String name;
	int []marks=new int[5];
	float avg;
	
	public static void main(String [] args)
	{
		Student [] obj=new Student[3];
		for(int i=0;i<3;i++)
		{
			obj[i]=new Student();
			obj[i].acceptData();
			obj[i].average();
			obj[i].display();
		}
		
	}
	Student()
	{
			//default constructor
	}
	Student(int id,int sem,String name,int [] marks)
	{
		//parameterized constructor
		this.id=id;
		this.sem=sem;
		this.marks=marks;
		this.name=name;
	}
	void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter sem");
		sem=sc.nextInt();
		System.out.println("enter marks of 5 papers");
		for(int i=0;i<5;i++)
		{
			marks[i]=sc.nextInt();
		}
		
	}
	void average()
	{
		float sum=0.0f;

		for(int i=0;i<5;i++)
			sum+=marks[i];
		avg=sum/5;
		
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Sem :"+sem);
		System.out.println("Average :"+avg);
		if(avg>=90)
			System.out.println("Grade : O");
		else if(avg>80)
			System.out.println("Grade : E");
		else if(avg>70)
			System.out.println("Grade : A");
		else if(avg>60)
			System.out.println("Grade : B");
		else
			System.out.println("Grade : Fail");
			
		
	}
	
	
}
