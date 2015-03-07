import static java.lang.System.*;

class ThreadTest3 implements Runnable
{
	public boolean state = false;
	public static void main(String[] args)
	{
		Runnable r = new ThreadTest3();
		Thread t = new Thread(r);
		t.start();
	}
	public void run()
	{
		for(int i = 0 ;i< 10 ; i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(1000);
		    }catch(Exception e)
		    {
				e.printStackTrace();
			}
		}
		state = Thread.isAlive();
		System.out.println(state);
	}
}