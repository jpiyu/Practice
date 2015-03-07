import java.awt.*;
import java.awt.event.*;

public class MyList extends Frame implements ItemListener {
    
    int[] msg;
    List lst;
    
    MyList() {
                setLayout(new FlowLayout());
                lst = new List(4,true);    // intially displays 4 items and multiple selection is also enabled //
                
                lst.add("hindi");
                lst.add("english");
                lst.add("punjabi");
                lst.add("kumaoni");
                lst.add("garhwali");
                
                add(lst);
                
                lst.addItemListener(this);
             }
    
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
        
    }
    
    public void paint (Graphics g)
    {
        g.drawString ("Selected Languages" ,100,200 );
        msg = lst.getSelectedIndexes();
        
        for (int i =0;i<msg.length ; i++)
        {
            String item = lst.getItem(msg[i]);
            g.drawString(item, 100, 220 + i*20);
        }
     }
    
    
public static void main(String[] args) {
        MyList ml = new MyList();
        ml.setTitle("my list box");
        ml.setSize(480,300);
        ml.setVisible(true);
        ml.addWindowListener (new MyClass());
    }
}


class MyClass extends WindowAdapter 
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
    
}