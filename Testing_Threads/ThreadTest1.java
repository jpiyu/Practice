import static java.lang.System.*;
import java.applet.*;
import java.awt.*;

class OurClass implements Runnable
{
	public void run()
	{
		for (int i=0; i< 10 ; i ++)
		{
			out.println(i);
		}
	}
}

class ThreadTest1 extends Applet
{
	public void init()
	{
		Runnable ot = new OurClass();
		Thread t = new Thread(ot);
		t.start();
	}
}