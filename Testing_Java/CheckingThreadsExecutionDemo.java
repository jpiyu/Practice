import static java.lang.System.*;
class A implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			out.print(Thread.currentThread().getId());
		}
	}
}
class CheckingThreadsExecutionDemo
{
	public static void main(String[] args)
	{
		Thread t = new Thread(new A());
		System.out.println(t.isAlive());
		t.start();

	}
}