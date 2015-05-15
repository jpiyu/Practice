import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class PriorityQueueWithObjects {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfMen = Integer.parseInt(br.readLine());
		PriorityQueue<Man> pq = new PriorityQueue<Man>(new MyComparator());
		Man m1 = null,m2 = null;
		System.out.println("Please enter the number of Men");
		while(numberOfMen > 0)
		{
			System.out.println("Enter the name");
			String name = br.readLine();
			System.out.println("Enter the age");
			int age = Integer.parseInt(br.readLine());
			m1 = new Man(name,age);
			pq.offer(m1);
			numberOfMen--;
		}
		System.out.println("Now we are printing the values in the priority queue");
		while(pq.size() != 0)
		{
			m2 = pq.poll();
			System.out.println("Name : " + m2.getName() + "---" + "Age : " + m2.getAge());
		}
	}
}
class MyComparator implements Comparator<Man>
{
	public int compare(Man m1,Man m2)
	{
		return (m1.getAge() - m2.getAge());
	}
}
class Man
{
	String name;
	int age;
	Man(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		//System.out.println(this.name);
		return this.name;
	}
	public int getAge()
	{
		//System.out.println(this.age);
		return this.age;
	}
}
