import java.awt.*;
import java.awt.event.*;


class KnowingFonts extends Frame {
	String Fonts[];

	public static void main(String[] args) {


		Frame f = new Frame();

		f.setSize(1024,768);
		f.setTitle("know your fonts");
		f.setVisible (true);

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

			String Fonts[]  = ge.getAvailableFontFamilyNames();

	System.out.println("here are the total no of fonts available in your system");


}

	public void paint(Graphics g)
	{


			g.drawString (Fonts[] , 100,100);




}
}