import static java.lang.System.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class DrawingDemo extends Frame
{
	DrawingDemo()
	{
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
			System.exit(0);
			}
		});
	}
	public static void main(String[] args)
	{
		Frame f = new Frame();
		f.setTitle("piyush");
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		g.drawRect(40, 40, 200, 200);
		g.drawOval(90, 70, 80, 80);
	}
}
