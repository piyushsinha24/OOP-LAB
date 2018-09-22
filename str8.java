import java.util.*;
class str8
{
	void extract(String str,int n,int m)
	{
		String str2=str.substring(n,n+m);
		System.out.println(str2);
	}
	public static void main(String []args)
	{
		String str;
		int n,m;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string\n");
		str=scn.nextLine();
		System.out.println("Enter nth index from where u wanna extract\n");
		n=scn.nextInt();
		System.out.println("Enter no.of characters u wanna extract\n");
		m=scn.nextInt();
		str8 obj=new str8();
		obj.extract(str,n,m);
	}
}
