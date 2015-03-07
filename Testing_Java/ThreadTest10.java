import static java.lang.System.*;
class Callme
{
	void call (String msg)
	{
		System.out.println("[" + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable
{
	String msg;
	Callme target;
	Thread t;
	public Caller (Callme target , String s)
	{
		target = targ;
		msg = s;
		t= new Thread(this);
		t.start();
	}
	public void run()
	{
		target.call(msg);
	}
}

class ThreadTest10
{
	public static void main(String[] args)
	{
		Callme target = new Callme();
		Caller ob1 = new Caller(target);

	}
}