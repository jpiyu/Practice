import java.awt.*;
import java.awt.event.*;

class Image extends Frame
{
	static Image img ;

	Image()
	{
		Image Img  = Toolkit.getDefaultToolkit().getImage("sp.jpg");

		MediaTracker track = new MediaTracker(this);

		track.addImage(img,0);

		try {

			track.waitForID(0);
		}
		catch(InterruptedException ie) {}


		addWindowListener(new WindowAdapter()
		{

			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}

		});

		public void paint(Graphics g)
		{
			g.drawImage(img,50,50,null);
		}

		public static void main(String[] args)
		{
			Image i = new Image();

			i.setSize(500,400);
			i.setTitle("hello");
			i.setVisible(true);

			i.setIconImage(img);
		}
	}
