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
		String [] arr=str.split(" ");
		Arrays.sort(arr);
		System.out.println("\nsorted :\n");
		for(i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);		
	}
}
