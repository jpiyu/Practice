package Miscellaneous;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
class User
{
	int amount;
	int age;
	User(int amount,int age)
	{
		this.amount = amount;
		this.age = age;
	}
}
class NewPriorityQueue
{
	User[] array;
	int size;
	private final int MAXSIZE = 20;
	NewPriorityQueue()
	{
		array = new User[MAXSIZE];
		size = 0;
	}
	public void add(User u)
	{
		int i;
		if(size == 0)
		{
			array[size++] = u;
		}
		else
		{
			for(i=0;i<size;i++)
			{
				if(u.age < array[i].age)
				{
					break;
				}
			}
			System.out.println("value of i" + i);
			for(int j=size-1;j>=i;j--)
			{
				array[j+1] = array[j];
			}
			array[i] = u;
			size++;
		}
	}
	public User returnMax()
	{
		return array[size-1];
	}
	public void remove(int index)
	{
		for(int i=index;i<size;i++)
		{
			array[i+1] = array[i];
		}
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println("the amount is : " + array[i].amount + " " + "and the age is : " + array[i].age);
		}
	}
}
public class PriorityQueueDemo2 {
	public static void main(String[] args) throws Exception
	{
		NewPriorityQueue pq = new NewPriorityQueue();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of users");
		int users = Integer.parseInt(br.readLine());
		while(users > 0)
		{
			String[] str = br.readLine().split(" ");
			User u = new User(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
			pq.add(u);
			users--;
		}
		pq.display();
	}
}
