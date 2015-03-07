import java.awt.*;
import java.awt.event.*;

class DrawPoly2 extends Frame {

	DrawPoly2 () {
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {

		g.setColor(Color.blue);
		g.fillRect(40,40,200,200);

		g.setColor(Color.yellow);

		g.fillOval(90,70,80,80);

		g.setColor(Color.black);

		g.fillOval(110,95,5,5);
		g.fillOval(145,95,5,5);

}

public static void main(String[] args) {

	DrawPoly2 d = new DrawPoly2();

	d.setSize(1024,768);

	d.setVisible(true);
	d.setTitle("heyy!!!!!!");

}
}
