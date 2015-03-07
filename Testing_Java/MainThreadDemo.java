import static java.lang.System.*;
class A implements Runnable
{
	Thread t;
	A()
	{
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("in another thread");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
class MainThreadDemo
{
	public static void main(String[] args)
	{
		A a = new A();
		for(int i=0; i<10; i++)
		{
			System.out.println("in main");
		}
	}
}