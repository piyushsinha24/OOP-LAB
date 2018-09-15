import java.util.*;
import java.lang.*;
class str_len
{
	public static void main(String []args)
	{
		Scanner scn=new Scanner(System.in);
		int i;
		String str;
		str=scn.nextLine();
		int n=str.length();
		System.out.println("length of input string :"+n);
		String str2=str.trim();
		int n2=str2.length();
		System.out.println("length of input string without front and end spaces:"+n2);
	}
}
