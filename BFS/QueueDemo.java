package BFS;
import java.io.*;
import static java.lang.System.*;
class Queue
{
	int front,rear;
	int array[];
	int numberOfItems;
	Queue(int size)
	{
		array = new int[size];
		front = 0;
		rear = -1;
		numberOfItems = 0;
		for(int i=0;i<array.length;i++)
		{
			array[i] = 0;
		}
	}
	public void insert(int value)
	{
		if(rear == array.length-1)
		{
			rear = -1;
		}
		array[++rear] = value;
		numberOfItems++;
	}
	public int peek()
	{
		return array[front];
	}
	public int remove()
	{
		int value = array[front];
		array[front] = 0;
		front++;
		if(front == array.length)
		{
			front = 0;
		}
		numberOfItems--;
		return value;
	}
	public boolean isEmpty()
	{
		return (numberOfItems == 0);
	}
	public boolean isFull()
	{
		return (numberOfItems == array.length-1);
	}
	public int size()
	{
		return numberOfItems;
	}
	public void showQueue()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
public class QueueDemo {
	public static void main(String[] args)
	{
		Queue queue = new Queue(10);
		queue.insert(1);
		queue.insert(2);
		queue.showQueue();
		queue.insert(3);
		queue.insert(4);
		queue.showQueue();
		queue.insert(5);
		queue.insert(6);
		queue.insert(7);
		queue.showQueue();
		queue.remove();
		queue.remove();
		queue.showQueue();

	}
}
