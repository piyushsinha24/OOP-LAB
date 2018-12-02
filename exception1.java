import java.util.*;
class exception1
{
	 public static void main(String[] args) {
		try
		{
			int a=5;
			int b=0;
			int c=a/b;
			System.out.print(c);
		}catch(Exception e){
			System.out.print(e);
		}
	}
}