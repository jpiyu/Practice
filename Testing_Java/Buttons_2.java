import java.awt.*;
import java.awt.event.*;

public class Buttons extends Frame {
    Button b1,b2,b3;

    Buttons ()
    {
        this.setLayout(null);
        b1 = new Button("yellow");
        b2 = new Button("red");
        b3 = new Button("green");

        b1.setBounds(100,100,70,40);
        b1.setBounds(200,100,70,40);
        b1.setBounds(300,100,70,40);

        this.add(b1);
        this.add(b2);
        this.add(b3);


	}



        public static void main(String[] args)
        {
            Buttons mb = new Buttons();
            mb.setSize(1024,768);
            mb.setTitle("My Buttons Demo");
            mb.setVisible(true);

            mb.addActionListener(new MyClass());

        }

    }


		class MyClass implements ActionListener
		{
			 public void actionPerformed(ActionEvent ae)
			        {
			            String str = ae.getActionCommand();  //knows the label of the button

			            if (str.equals("yellow")) this.setBackground(Color.yellow);
			            if (str.equals("red")) this.setBackground(Color.red);
			            if (str.equals("green")) this.setBackground(Color.green);

        }
	}