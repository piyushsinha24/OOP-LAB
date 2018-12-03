import java.io.*;
class exception6 
{
	 public static void main(String[] args) 
	{
		try
		{
		throw new NullPointerException();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
