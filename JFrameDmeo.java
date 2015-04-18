import static java.lang.System.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
public class JFrameDmeo {
	public static void main(String[] args)
	{
		Runnable runner = new Runnable() {
			
			@Override
			public void run() {
			
				Icon icon = new ImageIcon("h.jpg");
				
				
				JFrame jf = new JFrame();
				jf.setTitle("ENGLISH TO HINDI TRANSLATOR");
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.setVisible(true);
				jf.setSize(1366, 768);
				
				JPanel jp = new JPanel(new BorderLayout());
				jp.setBackground(Color.gray);
				jp.setLayout(new FlowLayout());
				jf.add(jp);
				
				
				JPanel jp2 = new JPanel(new BorderLayout());
				
				JPanel jp3 = new JPanel(new BorderLayout());
				
				JPanel jptemp = new JPanel();
				
				jp.add(jp2,BorderLayout.NORTH);
				jp.add(jp3,BorderLayout.SOUTH);
				jp.add(jptemp);
				
				JLabel jlabel1 = new JLabel("english");
				
				JLabel jlabel2 = new JLabel("hindi");				
				
				
				jp3.add(jlabel2,BorderLayout.NORTH);
				
				JTextArea jtarea1 = new JTextArea(10, 30);
				Border border = new BevelBorder(BevelBorder.RAISED, Color.pink, Color.red);

				jtarea1.setBorder(border);

				jp2.add(jtarea1,BorderLayout.SOUTH);
				
				jp2.add(jlabel1,BorderLayout.NORTH);
				
				JButton jb = new JButton("Click Me"){
					
					public JToolTip createToolTip()
					{
						JToolTip tip = super.createToolTip();
						tip.setBackground(Color.yellow);
						tip.setForeground(Color.black);
						tip.setToolTipText("press me to convert");
						return tip;
					}
					
				};
				Border softBevelBorder = new SoftBevelBorder(SoftBevelBorder.RAISED,Color.DARK_GRAY,Color.gray);
				jb.setBorder(softBevelBorder);
				jb.setBounds(0, 0, 50, 50);
				jb.setIcon(icon);
				jptemp.add(jb);
				
				
				JTextArea jtarea2 = new JTextArea(10, 30);
				jtarea2.setAlignmentX(200);
				jtarea2.setAlignmentY(500);
				jtarea2.setBorder(border);
				jp3.add(jtarea2,BorderLayout.SOUTH);
				
				jb.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						String str = jtarea1.getText();
						//System.out.println(str);
						
						
						jtarea2.setText(str);
						
					}
				});
				
				
				
			}
		};
		EventQueue.invokeLater(runner);
	}
}
