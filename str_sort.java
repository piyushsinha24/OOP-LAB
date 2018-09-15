import java.util.*;
import java.lang.*;
class str_sort
{
	public static void main(String []args)
	{
		Scanner scn=new Scanner(System.in);
		int i;
		String str;
		str=scn.nextLine();
		int n=str.length();
		String [] arr=str.split("");
		System.out.println("Without sort :\n");
		for(i=0;i<n;i++)
			System.out.print(arr[i]);
		Arrays.sort(arr);
		System.out.println("\nsorted :\n");
		for(i=0;i<n;i++)
			System.out.print(arr[i]);		
	}
}
