import static java.lang.System.*;
class JFrameDemo
{
		JFrame jfrm = new JFrame("this is a simple frame");
			Container c = jfrm.getContentPane();
			jfrm.setSize(100,400);
			jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	public static void main(String[] args)
	{
		SwingU