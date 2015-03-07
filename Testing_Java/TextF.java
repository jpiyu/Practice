import java.awt.*;
import java.awt.event.*;

public class TextF extends Frame implements ActionListener {

               TextField Name,Pass;

               TextF() {

                   setLayout(new FlowLayout());
                   Label n = new Label("Name:", Label.LEFT);
                   Label p = new Label("Pass Word", Label.LEFT);

                   Name = new TextField(20);
                   Pass = new TextField(20);

                   Pass.setEchoChar('*');

                   Name.setBackground(Color.yellow);
                   Name.setForeground(Color.red);
                   Font f = new Font("Arial", Font.PLAIN , 25);
                   Name.setFont(f);

                   add(n);
                   add(Name);
                   add(p);
                   add(Pass);

                   Name.addActionListener(this);
                   Pass.addActionListener(this);

               }

               public void actionPerformed (ActionEvent ae)
               {
                   Graphics g = this.getGraphics();
                   g.drawString("Name:" +Name.getText() , 10,200);
                   g.drawString("Pass Word:" +Pass.getText(), 10,240);
               }

               public static void main(String[] args)
               {
                   TextF mt = new TextF();
                   mt.setSize(400,400);
                   mt.setTitle("this is a text box");
                   mt.setVisible(true);

               }
}
