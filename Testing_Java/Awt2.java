import java.awt.*;
import java.awt.event.*;

class awt2 extends Frame
{

	public static void main(String args[])  {

		MyFrame f = new MyFrame();

		f.setTitle("piyush");

		f.setSize(300,250);

		f.setVisible(true);

		f.addWindowListener(new Myclass());

	}
}

class MyClass implements WindowListener {

	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e)
		{

			System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}


}
