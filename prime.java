import java.util.*;
public class prime
{
	
	public static void main(String [] args)
	{	
			int f=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter lower range");
			int low=sc.nextInt();
			System.out.println("Enter upper range");
			int high=sc.nextInt();
			for(int i=low;i<=high;i++)
			{
				f=0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					 f=1;
				}
				if(f==0)
					System.out.println(i);
				
			}
		
				



			
			
	}
}
