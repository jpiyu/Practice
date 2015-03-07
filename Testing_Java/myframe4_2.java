import java.awt.*;
import java.awt.event.*;

class myframe4v extends Frame
{

	public static void main(String args[])  {

		MyFrame f = new MyFrame();

		f.setTitle("piyush");

		f.setSize(300,250);

		f.setVisible(true);

		f.addWindowListener(new MyClass());

	}
}

class MyClass extends WindowAdapter {


	public void windowClosing(WindowEvent e)
		{

			System.exit(0);
	}


}
