import java.util.*;
class  PayOutOfBoundException extends Exception
{
	 PayOutOfBoundException(String message)
	{
		super(message);
	}
}
class TestCustomException
{
    void check(int sal)throws PayOutOfBoundException
	{
		if(sal<10000)
			throw new PayOutOfBoundException("LESS THAN 10000/-");
		else
			System.out.println("Good to go");

	}
}
public class exception5
{
	public static void main(String[] args) {
		TestCustomException t=new TestCustomException();
			try{
				t.check(8000);
			}catch(Exception e){System.out.println(e);}
		
	}
}