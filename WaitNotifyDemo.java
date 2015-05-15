import static java.lang.System.*;
class CreateThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			out.println(i);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		notify();
	}
}
class WaitNotifyDemo
{
	public static void main(String[] args)
	{
		CreateThread ct = new CreateThread();
		ct.start();
		try
		{
		Thread.currentThread().wait();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int j =0;j<5;j++)
		{
			out.println("hello");
		}
	}
}
