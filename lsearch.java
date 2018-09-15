import java.util.*;
public class lsearch
{
	
	public static void main(String [] args)
	{	
			int index=0,f=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array size");
			int num=sc.nextInt();
			int a[]=new int[num];
			System.out.println("Enter the elements");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("enter key");
			int key=sc.nextInt();
			for(int i:a)
			{
				if(a[i]==key)
				{
					f=1;
					index=i;
					break;
				}
			}
			if(f==0)
			{
				System.out.println("not found");
				
			}
			else
			System.out.println(" found at "+index);
					
			



			
			
	}
}
