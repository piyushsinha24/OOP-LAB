import java.util.*;
class exception2
{
	 public static void main(String[] args) {
		try
		{
			int [] a=new int [5];
			System.out.print(a[-1]);
		}catch(Exception e){
			System.out.print(e);
		}
		try
		{
			String s="ami tomake bhalo bhasi";
			char c=s.charAt(60);
		}catch(Exception e){
			System.out.print(e);
		}
	}
}