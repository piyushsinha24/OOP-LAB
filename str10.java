import java.util.*;
class str10
{
	public static void main(String [] args)
	{
		int count=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Who is the inventor of Java");
		while(true)
		{
			String ans=scn.nextLine();
			if(ans.equals("James Gosling"))
			{
				System.out.println("Correct Answer");
				break;
			}
			else
			{
				count++;
				if(count>3)
				{
					System.out.println("3 Attempts over.The correct ans is James Gosling.");
					break;
				}
				System.out.println("Try Again");
			}
		}
		
		
		
	}	
}
