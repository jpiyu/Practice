import static java.lang.System.*;
import java.io.*;
class LinkedList
{
	LinkedList next = null;
	int data;
	LinkedList(int data)
	{
		this.data = data;
	}
	public void appendToTail(int d)
	{
		LinkedList node = new LinkedList(d);
		LinkedList ll = this;
		while(this.next != null)
		{
			ll = ll.next;
		}
		ll.next = node;

	}
	public void show()
	{
		LinkedList ll = this;
		while(ll.next != null)
		{
			System.out.println(ll.data);
		}
	}
}
public class LinkedListDemo {
	public static void main(String[] args)
	{
		LinkedList head = new LinkedList(5);
		//head.appendToTail(10);
		head.show();
		
	}

}
