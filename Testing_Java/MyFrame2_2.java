import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame {

	public static void main(String[] args) {



		MyFrame f = new MyFrame();

		f.setTitle("piyush");

		f.setSize(1024,768);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter()

		{

			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

	}
}

