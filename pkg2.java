package pkgtwo;
import pkgone.maths;
public class pkg2 implements maths
{
	public void sum(int x,int y)
	{
		System.out.println("sum = "+(x+y));
	}
	public void diff(int x,int y)
	{
		System.out.println("diff = "+(x-y));
	}
	public void mul(int x,int y)
	{
		System.out.println("mult = "+(x*y));
	}
	public static void main(String args[])
	{
		pkg2 obj=new pkg2();
		obj.sum(4,2);
		obj.diff(4,2);
		obj.mul(4,2);
		
	}
}
