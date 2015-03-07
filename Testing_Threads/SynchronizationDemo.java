// doubt generated ,,, just run the program

import static java.lang.System.*;

class ThreadsDemo implements Runnable
{
	PassedThread pt;
	Thread t;
	String name;
	ThreadsDemo(String str, PassedThread pt)
	{
		name = str;
		this.pt = pt;
		t = new Thread(this, name);
		t.start();

	}
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		pt.hello();
	}
}

class PassedThread
{
	Thread t = Thread.currentThread();
	int count = 0;
	void hello()
	{
		for(int i = 0;i<10;i++)
		{
			count++;
		}
		System.out.println(t.getName() + "" + count);
	}
}

class SynchronizationDemo
{
	public static void main(String[] args)
	{
		PassedThread pt = new PassedThread();
		ThreadsDemo td1 = new ThreadsDemo("piyush", pt);
		ThreadsDemo td2 = new ThreadsDemo("joshi", pt);
	}
}
