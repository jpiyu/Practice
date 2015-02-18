import static java.lang.System.*;
class NewThread implements Runnable
{
	Thread t;
	String name;
	NewThread(String str)
	{
		t = new Thread(str);
		t.start();
	}
	/*public void runThread()
	{
		t.start();
	}*/
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args)
	{
		NewThread nt = new NewThread("piyush");
		//nt.runThread();
		System.out.println("hello");
	}

}
