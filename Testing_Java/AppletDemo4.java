import static java.lang.System.*;
import java.applet.*;
import java.awt.*;


class AppletDemo4 extends Applet implements Runnable
{
	String msg = " hello my name is piyush joshi";
	Thread t ;
	int state;
	boolean stopFlag;
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.black);
	}
	public void start()
	{
		t = new Thread(this);
		t.start();
		stopFlag = false;
	}
	public void run()
	{
		char ch;
		for (;;)
		{
			try
			{
				repaint();
				ch = msg.charAt(0);
				Thread.sleep(1000);
				msg = msg + ch;
				if (stopFlag)
					break;
			}
			catch(Exception e)
			{
				System.out.println("Interrupted");
			}
		}
	}
	public void destroy()
	{
		stopFlag = true;
	}
	public void paint(Graphics g)
	{
		g.drawString(msg , 20 , 50);
	}


}