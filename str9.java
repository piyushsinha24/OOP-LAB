import java.util.*;
class str9
{
	String deleteMe(String str,int m)
	{
		String str1=str.substring(0,m-1);
		String str2=str.substring(m+1,str.length());
		String res=str1.concat(str2);
		return res;
	}
	public static void main(String args[])
	{
		String str;
		int m;
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter a String");
		str=scn.nextLine();
		System.out.println("Enter the mth index which u wanna remove");
		m=scn.nextInt();
		str9 obj=new str9();
		String result=obj.deleteMe(str,m);
		System.out.println(result);
	}
}
