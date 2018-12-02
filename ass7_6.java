import java.util.*;
class ass7_6
{
	public static void main(String args[])
	{
		final String s1=new String("DC");
		final String s2=new String("MCU");
		mythread1 t1=new mythread1(){
			public void run()
			{
				synchronized(s1)
				{
					System.out.println("t1 has locked s1");
					try{
						Thread.sleep(2000);
					}catch(Exception e)
					{
						System.out.println(e);
					}
				}
				synchronized(s2)
				{
					System.out.println("t1 has locked s2");
				}
			}
		};
		mythread1 t2=new mythread1(){
			public void run()
			{
				synchronized(s2)
				{
					System.out.println("t2 has locked s2");
					try{
						Thread.sleep(2000);
					}catch(Exception e)
					{
						System.out.println(e);
					}
				}
				synchronized(s1)
				{
					System.out.println("t2 has locked s1");
				}
			}
		};
		t1.start();
		t2.start();
	}
}