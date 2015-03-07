import static java.lang.System.*;

public class ThreadTest6 implements Runnable
{
	public static void main(String[] args)
	{
		ThreadTest6 tt = new ThreadTest6();
		Thread t = new Thread(tt);
		t.start();
	}
	public void run()
	{
		for(int count =0 ;count < 3; count++)
		{
			System.out.println("hello");
		}
	}
}