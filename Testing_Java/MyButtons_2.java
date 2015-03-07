import java.awt.*;
import java.awt.event.*;

class MyButtons extends Frame implements ActionListener  {

    Button b1,b2,b3;

    MyButtons() {
                    this.setLayout(new FlowLayout());

                    b1 = new Button("yellow");
                    b2 = new Button("blue");
                    b3 = new Button("pink");

                    add(b1);
                    add(b2);
                    add(b3);

                    b1.addActionListener(this);
                    b2.addActionListener(this);
                    b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1) setBackground(Color.yellow);
       if(ae.getSource() == b2) setBackground(Color.blue);
       if(ae.getSource() == b3) setBackground(Color.pink);
    }

    public static void main(String[] args)
    {

        MyButtons mb = new MyButtons();
        mb.setSize(1024,768);
        mb.setTitle("Buttons Again");
        mb.setVisible(true);
        mb.addWindowListener(new Myclass());

    }


}

class Myclass extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);

    }
}
