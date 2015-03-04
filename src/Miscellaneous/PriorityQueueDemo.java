package Miscellaneous;
import java.util.*;
import java.io.*;
import static java.lang.System.*;
class Unit
{
	int value;
	int priority;
	Unit(int value,int priority)
	{
		this.value = value;
		this.priority = priority;
	}
}
class PriorityQueue
{
	Unit[] array;
	private final int MAXSIZE = 20;
	int size;
	PriorityQueue()
	{
		array = new Unit[MAXSIZE];
		size = 0;
	}
	public void add(Unit u)
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
				if(u.priority < array[i].priority )  // stupid take care of the comparison 
				{
					break;
				}
			}
			System.out.println("the value of i is : " + i);
			for(int j=size-1;j>=i;j--)
			{
				array[j+1] = array[j];
			}
			array[i] = u;
			size++;
		
		}
		/*else                                // if items,
        {
        for(j=size-1; j>=0; j--)         // start at end,
           {
           if( u.priority > array[j].priority )      // if new item larger,
              array[j+1] = array[j]; // shift upward
           else                          // if smaller,
              break;                     // done shifting
           }  // end for
        array[j+1] = u;            // insert it
        size++;
        } */
	}
	public Unit getElement(int index)
	{
		return array[index];
	}
	public int getSize()
	{
		return size;
	}
}
class PriorityQueueDemo
{
	public static void main(String[] args) throws Exception
	{
		PriorityQueue pq = new PriorityQueue();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of elements");
		int elements = Integer.parseInt(br.readLine());
		while(elements > 0)
		{
			String[] str = br.readLine().split(" ");
			Unit u = new Unit(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
			pq.add(u);
			elements--;
		}
		System.out.println(pq.size);
		Unit u1 = pq.getElement(1);
		System.out.println(u1.priority);
	}
}