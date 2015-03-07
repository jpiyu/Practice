import java.awt.*;
import java.awt.event.*;

class DrawPoly extends Frame {

	public static void main(String[] args) {

		Frame f = new Frame();

		f.setTitle("piyush's window");

		f.setVisible(true);

		f.setSize(1027,768);

	f.addWindowListener (new Piyush());
}

public void paint(Graphics g) {

	g.drawRect(40,40,200,200);




}
}
class Piyush extends WindowAdapter {

	public void windowClosing(WindowEvent e) {

		System.exit(0);
	}}

