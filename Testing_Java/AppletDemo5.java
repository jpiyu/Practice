import static java.lang.System.*;
import java.applet.*;
class AppletDemo5 extends Applet
{
	public void init()
	{
		setBackground(Color.RED);
	}
	
	public void paint(Graphics g)
	{
	g.drawString("hello");
	}
}