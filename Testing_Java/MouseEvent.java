import static java.lang.System.*;
import java.awt.*;
import java.awt.event.*;

class MouseEvent extends Frame 
{
	MouseEvent()
	{
		super("piyush");
	}
	public static void main (String[] args)
	{
		MouseEvent m = new MouseEvent();
		m.setSize(500,500);
		m.setVisible(true);
		m.addMouseListener(new MyClass());
	}
}

class MyClass implements MouseListener
{
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("the mouse is clicked");
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}