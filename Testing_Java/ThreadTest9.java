import static java.lang.System.*;

class NewThread implements Runnable
{
	String name;
	Thread t ;
	NewThread (String s)
	{
		name = s;
		t = new Thread(this, name);
		t.start();
	}
	public void run()
	{
		for (int i = 10 ; i >=0; i--)
		{
			System.out.println("name" + t.getName() + "count" + i);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}
}

public class ThreadTest9 {
	public static void main(String[] args)
	{
		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");
		NewThread nt3 = new NewThread("three");


	}
}
