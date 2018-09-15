import java.util.*;
abstract class Abc
{
	int x;
	void show()
	{
		System.out.println(x);
	}
	abstract void calculate();
}
class Xyz extends Abc
{
	int a,b;
	void display()
	{
		System.out.println("a="+a+"b="+b);
	
	}
	void calculate()
	{
		int s=a*b;
		System.out.println(s);
	}
}
public class Abstract
{
	public static void main(String [] args)
	{
		Abc obj;
		obj=new Xyz();
		obj.calculate();
		obj.show();
	}
	
}
