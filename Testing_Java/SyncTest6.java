import static java.lang.System.*;

class Counter
{
	int x;
	boolean status = false;

	public synchronized void changeState()
	{
		try
		{
			Thread.sleep(2000);
			out.println("Changing object State....");
			Thread.sleep(2000);
			out.println("Processing....");
			Thread.sleep(2000);
			out.println("Done....");
			Thread.sleep(2000);
			out.println("Notifying waiting threads....");
			Thread.sleep(2000);
			status=true;
			//notify();		//Notify the longest waiting thread
			notifyAll();	//wait, notify, notifyAll - Object
		}
		catch(Exception ex){}
	}

	public synchronized void count()
	{
		if(status==false)
		{
			try
			{
				out.println(Thread.currentThread().getName()+" will now wait...");
				wait();
			}catch(Exception ex){}
		}
		x = 0;
		while(x<10)
		{
			x++;
			out.println(Thread.currentThread().getName()+" :"+x);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ex){}
		}
	}
}

class Worker extends Thread
{
	Counter c;
	Worker(Counter x)
	{
		c=x;
	}
	public void run()
	{
		out.println(getName()+" started...");
		c.count();
		out.println(getName()+" ended...");
	}
}

class Notifier extends Thread
{
	Counter c;
	Notifier(Counter x)
	{
		c=x;
	}
	public void run()
	{
		out.println(getName()+" started...");
		c.changeState();
		out.println(getName()+" ended...");
	}
}

class SyncTest6
{
	public static void main(String[] args)throws Exception
	{
		out.println("Main started...");

		Counter c1 = new Counter();

		Worker t1 = new Worker(c1);
		Worker t2 = new Worker(c1);
		Worker t3 = new Worker(c1);

		t1.setName("Alpha");
		t2.setName("Beta");
		t3.setName("Gamma");

		t1.start();t2.start();t3.start();

		Thread.sleep(3000);
		Notifier n = new Notifier(c1);
		n.setName("Notifier");
		n.start();

		t1.join();t2.join();t3.join();

		out.println("Main ended...");
	}
}


