package Package1;
import java.util.*;
public class myclass1
{
	protected int x=10;
	public void display(String s)
	{
		System.out.println(s);
	}
	public static void main(String [] args)
	{
		myclass1 obj=new myclass1();
		System.out.println("x= "+obj.x);
		obj.display("hello");
	}
}
