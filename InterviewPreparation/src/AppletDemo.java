import java.applet.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AppletDemo extends Applet
{
	public void init()
	{
		final Button btn1 = new Button("piyush");
		Button btn2 = new Button("joshi");
		Font font = new Font("Times New Roman",Font.BOLD,28);
		btn1.setFont(font);
		add(btn1);
		add(btn2);
		btn2.setBackground(Color.RED);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				btn1.setVisible(false);
			}
		});
	}
	
	public void paint(Graphics g)
	{
		g.drawString("helllo my name is piyush joshi",10,50);
	}
}
