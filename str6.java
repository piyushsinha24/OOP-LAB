import java.util.*;
class str6
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		String first,mid,last;
		char [] password=new char[10];
		int roll;
		String fullname=scn.nextLine();
		roll=scn.nextInt();
		String r=String.valueOf(roll);
		String rn=r.substring(Math.max(r.length()-4,0));
		String [] arr=fullname.split(" ");
		if(arr.length!=3)
		{
			 first=arr[0];
			 last=arr[1];
			 password[0]=first.charAt(0);
			 password[1]=last.charAt(0);
		}
		else
		{
			first=arr[0];
			mid=arr[1];
			last=arr[2];
			password[0]=first.charAt(0);
			password[1]=mid.charAt(0);
			password[2]=last.charAt(0);
		}
		String res=new String(password);
		String result=res.concat(rn);
		System.out.println(result);
		
	}
}
