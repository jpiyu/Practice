import static java.lang.System.*;
class A
{
	public void run()
	{
		for(int i = 0; i< 5 ; i++)
		{
			System.out.println("A :" + i);
		}
	}
}
class B extends A
{
	public void run()
	{
		for(int i = 0; i< 5;i++)
		{
			System.out.println("B :" + i);
			super.run();
		}
	}
}
class MainDemo
{
	public static void main(String[] args)
	{
		B b = new B();
		b.run();

	}
}