public class sumcons
{
	public static void main(String [] args)
	{
		int n=Integer.parseInt(args[0]);
		int i,j,sum;
		for(i=n/2;i>0;i--)
		{
			sum=0;
			for(j=i;j<15;j++)

			{
				sum+=j;
				if(sum==n)
					break;
					
			}
			if(sum==n)
			{
				for(int t=i;t<=j;t++)
				{
					System.out.print(t+"");
				}
				System.out.println();
				
			}
		}
	}
}
