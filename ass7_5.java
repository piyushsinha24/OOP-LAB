import java.util.*;
class mythread1 extends Thread
{
	mythread1()
	{
		//System.out.println("STARTING THREAD");
	}
	public void run()
	{
					String name=Thread.currentThread().getName();
					System.out.println(name);
					try
					{
						Thread.sleep(2000);
					}catch(Exception e){System.out.println(e);}
			
		
	}
}
class ass7_5
{
	public static void main(String args[])
	{
		mythread1 mt1=new mythread1();
		mythread1 mt2=new mythread1();
		mt1.start();
		try
		{
			mt1.join();
		}catch(Exception e){}
		
		mt2.start();
		System.out.println(mt1.isAlive());
		System.out.println(mt2.isAlive());
	}
}