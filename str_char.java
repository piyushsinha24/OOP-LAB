import java.util.*;
class str_char
{
	public static void main(String []args)
	{
		Scanner scn=new Scanner(System.in);
		int i;
		String str;
		str=scn.next();
		int n=str.length();
		char [] arr=new char[n];
		for(i=0;i<n;i++)
		{
			arr[i]=str.charAt(i);
		}
		for(i=0;i<n;i++)
			System.out.println(arr[i]);		
	}
}
