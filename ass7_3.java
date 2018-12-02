import java.util.*;
class mythread1 extends Thread
{
	mythread1()
	{
		System.out.println("STARTING THREAD");
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
class ass7_3
{
	public static void main(String args[])
	{
		mythread1 mt1=new mythread1();
		mythread1 mt2=new mythread1();
		mythread1 mt3=new mythread1();
		mythread1 mt4=new mythread1();
		mythread1 mt5=new mythread1();
		mt1.setPriority(1);
		mt2.setPriority(2);
		mt3.setPriority(3);
		mt4.setPriority(4);
		mt5.setPriority(5);
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
	}
}