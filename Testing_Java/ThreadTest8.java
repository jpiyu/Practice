import static java.lang.System.*;

class NewThread implements Runnable
{
	String name;
	Thread t;
	NewThread(String s)
	{
		name = s ;
		t = new Thread (this , name);
		t.start();
	}
	public void run()
	{
		for (int i =0 ; i<10 ; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted");
			}
		}
	}
}
public class ThreadTest8 {
	public static void main(String[] args)
	{
		NewThread nt = new NewThread("piyush");
	}
}
