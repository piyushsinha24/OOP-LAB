import java.util.*;
class Account
{
	String name;
	long accno;
	double bal;
	String acc_type;
	Account(String name,long accno,double bal,String acc_type)
	{
		this.name=name;
		this.accno=accno;
		this.bal=bal;
		this.acc_type=acc_type;
	}
	void deposit()
	{
		
	}
	void displayBal()
	{
		
	}
}
class Saving extends Account
{
	double rate=5.2;
	Saving(String name,long accno,double bal,String acc_type)
	{
		super(name,accno,bal,acc_type);
	}
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		double deposit=sc.nextDouble();
		bal+=deposit;
		System.out.println("Balance="+bal);
	}
	void displayBal()
	{
		System.out.println("Balance="+bal);
	}
	void compound()
	{
		double t;
		double amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time");
		t=sc.nextDouble();
		amt=bal*Math.pow((1+(rate/100)),t);
		bal=amt;
	}
	
}
class Current extends Account
{
	Current(String name,long accno,double bal,String acc_type)
	{
		super(name,accno,bal,acc_type);
	}
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		double deposit=sc.nextDouble();
		bal+=deposit;
	}
	void displayBal()
	{
		if(bal<1000)
			bal-=100;
		System.out.println("Balance="+bal);
	}
}
class Acc_test
{
	public static void main(String args[])
	{
		Scanner scn =new Scanner(System.in);
		String cust_name,ac_type;
		double bal;
		System.out.println("Enter customer name");
		cust_name=scn.next();
		System.out.println("Enter account type");
		ac_type=scn.next();
		System.out.println("Enter balance");
		bal=scn.nextDouble();
		Random r=new Random();
		long ac=r.nextInt(100000);
		Saving obj1=new Saving(cust_name,ac,bal,ac_type);
		Current obj2=new Current(cust_name,ac,bal,ac_type);
		while(10>0)
		{
			if(ac_type.equals("saving"))
			{
				
				//Saving obj=new Saving(cust_name,ac,bal,ac_type);
				System.out.println("Press 1 to deposit");
				System.out.println("Press 2 to display balance");
				System.out.println("Press 3 to compound interest");
				System.out.println("Press 4 to exit");
				int ch=scn.nextInt();
				switch(ch)
				{
					case 1:obj1.deposit();
							break;
					case 2:obj1.displayBal();
							break;
					case 3:obj1.compound();
							break;
					case 4:System.exit(0);
							break;
					default:System.out.println("Wrong Selection");
							break;
					
				}
			
			}
				else
				{
				
					//Current obj=new Current(cust_name,ac,bal,ac_type);
					System.out.println("Press 1 to deposit");
					System.out.println("Press 2 to display balance");
					System.out.println("Press 3 to exit");
					int ch=scn.nextInt();
					switch(ch)
					{
						case 1:obj2.deposit();
								break;
						case 2:obj2.displayBal();
								break;
						case 3:System.exit(0);
								break;
						default:System.out.println("Wrong Selection");
								break;
					
					}
					
				}
			}
		
		
		
	}
}
	

