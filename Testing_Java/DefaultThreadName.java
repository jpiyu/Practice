import static java.lang.System.*;
class A implements Runnable
{
	public void run()
	{
		out.println(Thread.currentThread().getName());
	}
}
class B implements Runnable
{
	public void run()
	{
		out.println(Thread.currentThread().getName());
	}
}
class DefaultThreadName
{
	public static void main(String[] args)
	{
		Thread t = new Thread(new A());
		t.start();
		Thread t2 = new Thread(new B());
		t2.start(  );
	}
}
