import java.awt.*;
import java.awt.event.*;


class Images extends Frame {

	static Images img;

	Images() {

		img = Toolkit.getDefaultTootkit().getImage("sp.jpg");

		MediaTracker track = new MediaTracker(this);

		track.addImage(img,0);

		try
		{
			track.waitForID(0);
		}
		catch (InterruptedException ie)
		{}

		addWindowListener(new WindowAdapter()
		{

			public void windowClosing (windowEvent we)

			{
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g)
	{
		g.drawImage(img,50,50,null);
	}


	public static void main(String[] args)
	{
		Images i = new Images();

		i.setSize(1024,768);
		i.setTitle("my image");
		i.setVisible(true);

		i.setIconImage(img);
	}
}

