import static java.lang.System.*;
import java.util.*;
import java.io.*;
class Queue
{
	int array[],front,rear;
	int size;
	Queue(int size)
	{
		this.size = size;
		array = new int[size];
		front =  -1;
		rear = -1;
	}
	public void insert(int value)
	{
		if(!isFull())
		{
			if(front == -1 || rear == -1)
			{
				front = rear = 0;
			}
			array[++rear] = value;
		}
	}
	public void remove()
	{
		if(!isEmpty())
		{
			int removedNum = array[++front];
		}
	}
	public boolean isFull()
	{
		if(rear == size-1)
		{
			return true;
		}
		else
			return false;
	}
	public boolean isEmpty()
	{
		if((front == -1 )|| (front == rear + 1))
		{
			return true;
		}
		else
			return false;
	}
	public void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(array[i]);
		}
	}
}
public class QueueDemo {
	public static void main(String[] args)
	{
		Queue q = new Queue(5);
		for(int i=0;i<5;i++)
		{
			q.insert(i);
		}
		q.display();
	}
}
