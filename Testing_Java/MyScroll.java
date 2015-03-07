import java.awt.*;
import java.awt.event.*;

public class MyScroll extends Frame
{
                   String msg = "";
                   Scrollbar s1;    //create the reference of the Scrollbar object //

                   MyScroll () {
                       setLayout(null);

                       s1 = new Scrollbar(Scrollbar.VERTICAL , 0,30,0,400);
                       s1.setBounds(780,50,30,200);

                       add(s1);




                   }



    public static void main(String[] args) {

        MyScroll ms = new MyScroll();
        ms.setTitle("Scrolling");
        ms.setSize(1024,768);
        ms.setVisible(true);
        ms.addWindowListener(new MyClass());

    }
}

class MyClass extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
            }