import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class ImageAppletDemo extends Applet {
	Image picture;

	public void init()
	{
		picture = getImage(getDocumentBase(),"p.jpg");
	}
	public void paint(Graphics g)
	{
		for(int i=10;i<100;i=i+2)
		{
			for(int j=10;j<300;j++)
			{
				g.drawString("hello my name is piyush",i,j);
				try
				{
					Thread.sleep(1000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
