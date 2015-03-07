import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    
    
    public void paint(Graphics g)
    {
        super.paintComponent(g);
        g.setBackground(Color.green);
        g.setColor(Color.red);
        g.setFont (new Font("Helvetica" , Font.BOLD , 25));
        g.drawString("hi my name is piyush joshi", 100, 50);
        
        
    }
}

public class FrameDemo extends JFrame {
    FrameDemo()
                {
                    Container c = this.getContentPane(); //understand the use of this here by manipulating the statement yourself // 
                    
                    MyPanel mp = new MyPanel();
                    c.add(mp);
                }
    
    public static void main(String[] args)
    {
        FrameDemo obj = new FrameDemo();
        obj.setTitle("My Swing Frame");
        obj.setSize(1024,768);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}

