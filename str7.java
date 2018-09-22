import java.util.*;
import java.lang.*;
class str7
{
	public static void main(String []args)
	{
		Scanner scn=new Scanner(System.in);
		int i;
		String str;
		str=scn.nextLine();
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
	}
}
