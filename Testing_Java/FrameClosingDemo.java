import static java.lang.System.*;
import java.awt.*;
import java.awt.Event;

class FrameClosingDemo extends Frame 
{
	public static void main(String[] args)
	{
	Frame f = new Frame();
	f.setTitle("piyush");
	f.setSize(200,300);
	f.addWindowListener(new MyClass());
    }
}

class MyClass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
