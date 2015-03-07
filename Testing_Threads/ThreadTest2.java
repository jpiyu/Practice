import static java.lang.System.*;
class MainClass implements Runnable
{
	Thread t;
	MainClass(String str)
	{
		t = new Thread(this , str);
		t.start();
	}

	public void run()
	{
		for(int i =0; i<10 ; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());       // or we can use t.getName() also //
		}
	}
}

class ThreadTest2
{
	public static void main(String[] args)
	{
		MainClass mc = new MainClass("piyush");
		for (int i = 10 ; i > 0 ; i++)
				{
					System.out.println(i);
				}
	}
}