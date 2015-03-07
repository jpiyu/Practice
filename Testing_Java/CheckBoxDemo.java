import static java.lang.System.*;
import java.awt.*;
import java.awt.event.*;

class CheckBoxDemo extends Frame implements ItemListener
{
	String msg = "";
	Checkbox c1, c2, c3 ;
	
	CheckBoxDemo()
	{
		setLayout(new FlowLayout());
		c1 = new Checkbox("bold" , true);
		c2 = new Checkbox("italic");
		c3 = new Checkbox("underlined");
		
		add(c1);
		add(c2);
		add(c3);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
	
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("current state :", 10, 100);
		msg = "bold : " + c1.getState();
		g.drawString("current state :", 10, 120);
		msg = "italic : " + c2.getState();
		g.drawString("current state :", 10, 140);
		msg = "underlined : " + c3.getState();
		g.drawString(msg , 10 , 160);
		
	}
	public static void main(String[] args)
	{
		CheckBoxDemo cbd = new CheckBoxDemo();
		cbd.setTitle("check box demo and event handling program");
		cbd.setSize(800,800);
		cbd.setVisible(true);
	}
}