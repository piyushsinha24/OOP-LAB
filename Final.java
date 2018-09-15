import java.util.*;
class Final
{
	int x,y;
	final float pi=3.14f;
	void display()
	{
		System.out.println(x+","+y+","+pi);
	}
	public static void main(String [] args)
	{
		Final obj=new Final();
		obj.display();
	}
}
