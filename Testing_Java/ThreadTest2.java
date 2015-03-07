import static java.lang.System.*;

class ThreadTest2
{
	public static void main(String[] args)
	{
		Thread t = new Thread()
		{
			public void run()
			{
				for (int i =0; i <10 ; i ++)
				{
					System.out.println(i);
				}
			}
		};
		t.start();


	}
}