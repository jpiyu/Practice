import static java.lang.System.*;
class A
{
	public void run()
	{
		go();
	}
	public void go()
	{
		doStuff();
	}
	public void doStuff()
	{
		System.out.println("calling Worked");
	}
}
class CallingMethodDemo
{
	public static void main(String[] args)
	{
		A a = new A();
		a.run();
	}
}