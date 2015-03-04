package Miscellaneous;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AmazonCheckingCycleInGraph {
	static List<Edge> list = new LinkedList<Edge>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter the graph in one line");
		String[] str = br.readLine().split(" ");
		int []arr = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		list.add(new Edge(arr[0],arr[1]));
		for(int i=1;i<arr.length-1;i++)
		{
			int source = arr[i];
			int destination = arr[i+1];
			Edge e1 = new Edge(source,destination);
			Iterator iter = list.iterator();
			while(iter.hasNext())
			{
				Edge e = (Edge)iter.next();
				e.showEdge();
				if(e1.source == e.destination && e1.destination == e.source)
				{
					System.out.println("Cycle found");
					return;
				}
				if(e1.source == e.destination)
				{
					list.remove(e);
					list.add(new Edge(e.source,e1.destination));
				}
			}
		}
		Iterator<Edge> iter2 = list.iterator();
		while(iter2.hasNext())
		{
			Edge e = (Edge)iter2.next();
			e.showEdge();
		}
		
	}
}
class Edge
{
	int source,destination;
	Edge(int source,int destination)
	{
		this.source = source;
		this.destination = destination;
	}
	public void showEdge()
	{
		System.out.println("Source : " + this.source + " " + "Destination : " + this.destination);
	}
}