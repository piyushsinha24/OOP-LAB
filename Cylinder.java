import java.io.*;
import java.util.*;
class Cylinder
{
	double r,h,v,tsa;
	Cylinder()
	{
	}
	Cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	public static void main(String [] args)
	{
		Cylinder obj=new Cylinder();
		obj.acceptData();
		obj.calc();
		obj.display();
	}
	void calc()
	{
		 v=3.14*r*r*h;
		tsa=2*3.14*r*(h+r);
	}
	void acceptData()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the radius ");
		r=scn.nextDouble();
		System.out.println("Enter the height ");
		h=scn.nextDouble();
	}
	void display()
	{
		System.out.println("Volume = "+v);
		System.out.println("Total Surface Area = "+tsa);
	}
}
