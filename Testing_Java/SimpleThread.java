import static java.lang.System.*;

class counter implements Runnable
{
	public void run()
	{
		for (int i = 0 ; i < 10 ; i++ )
			System.out.println(i);
	}
}

class SimpleThread
{
	public static void main(String[] args)
	{
		counter t = new counter();
		t.start();
	}


}