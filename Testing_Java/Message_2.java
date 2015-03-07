import java.awt.*;
import java.awt.event.*;



class Message extends Frame
{
		String str = "hello world";


	Message()
	{
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g)
	{
		this.setBackground(new Color(100,20,20));

		Font f = new Font("Times New Roman", Font.BOLD, 30);

		g.setFont(f);

		g.setColor(Color.green);

		g.drawString(str, 100,100);
	}

	public static void main(String[] args)
	{
		Message m = new Message();

		m.setSize(1024,768);
		m.setTitle("piyush's window");
		m.setVisible(true);
	}
}
