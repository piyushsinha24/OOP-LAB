import java.io.*;
class exception6
{
	 public static void main(String[] args) throws FileNotFoundException
	{
		PrintWriter pw=new PrintWriter("xyz.txt");
		pw.println("hello world");
	}
}
