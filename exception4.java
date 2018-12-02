class Parent
{
	void display(){
		System.out.println("Parent display called");
	};
}
class Child
{
	void display()
	{
		System.out.println("child display called");
	}
}
class exception4
{
	public static void main(String[] args) {
		try
		{
			Parent p;
			p=null;
			p.display();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}