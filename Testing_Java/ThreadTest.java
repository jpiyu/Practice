import static java.lang.System.*;

class example implements Runnable
{
	public void run()
	{
		for (int i=0 ; i <10 ; i ++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println("Interrupted");
			}

		}

	}
}

class ThreadTest
{
	public static void main(String[] args)
	{
	example ex = new example();
	Thread t = new Thread(ex);

	t.start();
	}

}