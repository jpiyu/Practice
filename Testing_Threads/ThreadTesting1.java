import static java.lang.System.*;

class Hello extends Thread
{
	public void run()
	{
		for(int i = 0 ; i< 10 ; i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(1000);
			}catch(InterruptedException ie)
			{
				System.out.println("Process Interrupted");
			}
		}
	}
}
class ThreadTesting1
{
	public static void main(String[] args)
	{
		Hello h = new Hello();
		h.start();
	}
}