import java.util.*;
class mythread1 extends Thread
{
	mythread1()
	{
		System.out.println("STARTING THREAD");
	}
	public void run()
	{
			for (int i=0;i<3 ;i++ ) {
					String name=Thread.currentThread().getName();
					System.out.println(name);
					try
					{
						Thread.sleep(2000);
					}catch(Exception e){System.out.println(e);}
			}
		
	}
}
class ass7_1 
{
	public static void main(String args[])
	{
		mythread1 mt1=new mythread1();
		mt1.start();
	}
}