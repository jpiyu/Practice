import static java.lang.System.*;

import java.util.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.*;

import javax.swing.*;
public class SandyWindow {
	public static void main(String[] args)
	{
		Runnable runner = new Runnable() {
			
			@Override
			public void run() {
				JFrame jf = new JFrame();
				jf.setTitle("sandy's application");
				jf.setVisible(true);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.setSize(1366,768);
				
				/** adding jpanel
				 * 
				 */
				
				JPanel jp1 = new JPanel();
				jp1.setSize(300, 300);
				jp1.setBackground(Color.BLUE);
				jp1.setBorder(BorderFactory.createEtchedBorder());
				jf.add(jp1);
				
				
				/** adding textbox
				 * 
				 */
				
				JTextArea jt = new JTextArea(400,400);
				//jt.setSize(400, 400);
				//jt.setBackground(Color.gray);
				jp1.add(jt);
				
			}
		};
		EventQueue.invokeLater(runner);
	}
}
