import java.util.*;
interface shape_super
{
	 double pie=3.14;
	 public void area();
	 default void show()
	 {
		System.out.println("default func ");
	 }
	 static void display()
	 {
		System.out.println("static func ");
	 }
	 
	 
}
class circle implements shape_super
{
	public void area()
	{
		double r=4.0;
		double a=pie*r*r;
		System.out.println(a);
	}
}
class rectangle implements shape_super
{
	public void area()
	{
		double l=4.0,b=5.0;
		double a=l*b;
		System.out.println(a);
	}
}
public class shape
{
	public static void main(String args[])
	{
		circle obj1=new circle();
		obj1.area();
		rectangle obj2=new rectangle();
		obj2.area();
		obj1.show();
		shape_super.display();
		
	}
}

