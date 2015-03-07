import java.awt.*;

class Awt extends Frame {

	Awt (String str) {

		super (str);
	}


	public static void main (String[] args)
	{

		Frame f = new Frame("hello");

		f.setSize(300,250);
		f.setVisible(true);

	}
}
