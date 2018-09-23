import java.util.*;
class str12
{
	public static void main(String [] args)
	{
		StringBuffer str = new StringBuffer("Object Programming Languages");
		int c = str.capacity();
		int len = str.length(); 
		System.out.println(str);
		System.out.println("Capacity :"+c);
		System.out.println("Length :"+len);
		int i=str.indexOf("t");
		str.insert(i+1,"Oriented");
		System.out.println(str);
		str.insert(6,"-");
		System.out.println(str);
		str.append(" are very popular.");
		System.out.println(str);
		str.deleteCharAt(6);//deleting "-"
		System.out.println(str);
		str.insert(6," ");//inserting space
		System.out.println(str);
		str.delete(1,7);
		str.delete(2,10);
		str.delete(3,13);
		System.out.println(str);
		String s=str.toString();//String buffer obj to string class obj
		System.out.println(str);
	}
}
