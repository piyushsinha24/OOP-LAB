import java.io.*;
import java.util.*;
import java.lang.Math;
class Cylinder
{
	double r,h,v,tsa;
	
	
	void calc()
	{
		 v=3.14*r*r*h;
		tsa=2*3.14*r*(h+r);
	}
	void acceptData()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the radius of cylinder ");
		r=scn.nextDouble();
		System.out.println("Enter the height of cylinder ");
		h=scn.nextDouble();
	}
	void display()
	{
		System.out.println("Volume = "+v);
		System.out.println("Total Surface Area = "+tsa);
	}
}
class Cone
{
	double r,h,v,tsa;
	
	
	void calc()
	{
		 v=(3.14*r*r*h)/3.0;
		tsa=3.14*r*(r+Math.sqrt(h*h+r*r));
	}
	void acceptData()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the radius of cone");
		r=scn.nextDouble();
		System.out.println("Enter the height of cone");
		h=scn.nextDouble();
	}
	void display()
	{
		System.out.println("Volume = "+v);
		System.out.println("Total Surface Area = "+tsa);
	}
}
class Geometry
{
	public static void main(String [] args)
	{
		Cylinder c1=new Cylinder();
		c1.acceptData();
		c1.calc();
		c1.display();
		Cone c2=new Cone();
		c2.acceptData();
		c2.calc();
		c2.display();
	}
}
