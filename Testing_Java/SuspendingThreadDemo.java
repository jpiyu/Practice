import static java.lang.System.*;
class MyThread implements Runnable
{
	Thread t;
	String name;
	boolean suspendFlag;
	MyThread(String name)
	{
		suspendFlag = false;
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New Thread" +" " + t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=15; i>0; i--)
			{
				System.out.println(name + " " + i);
				Thread.sleep(1000);
				while(suspendFlag)
				{
					wait();
				}
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	void mySuspend()
	{
		suspendFlag = true;
	}
	void myResume()
	{
		suspendFlag = false;
		notify();
	}
}
class SuspendingThreadDemo
{
	public static void main(String[] args)
	{
		MyThread mt1 = new MyThread("piyush");
		MyThread mt2 = new MyThread("joshi");
	//try
	//{
		System.out.println(Thread.currentThread().getName();
	//}
	/*catch(InterruptedException ie)
	{
		ie.printStackTrace();
	}*/
    }
}