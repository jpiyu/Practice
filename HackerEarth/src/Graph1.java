import java.io.*;
import java.util.Scanner;
class Node
{
	String str;
	boolean visited;
	Node(String str)
	{
		this.str = str;
		visited = false;
	}
	public String getString()
	{
		return this.str;
	}
}
public class Graph1 {
	static Node nodeArray[];
	static int[][] adjMat;
	public static void main(String[] args)
	{
		int count = 0;
		Scanner s = new Scanner(System.in);
		int nodes = s.nextInt();
		adjMat = new int[nodes][nodes];
		for(int i=0;i<nodes;i++)
		{
			for(int j=0;j<nodes;j++)
			{
				adjMat[i][j] = 0;
			}
		}
		nodeArray = new Node[nodes];
		System.out.println("enter a choice---- 1 to enter a node and 2 to enter an edge");
		int choice = Integer.parseInt(s.nextLine());
		switch(choice)
		{
		case 1:
			String string = s.nextLine();
			nodeArray[count++] = new Node(string);
			break;
		case 2:
			System.out.println("enter the nodes between which you want to enter the edge");
			String node1 = s.nextLine();
			String node2 = s.nextLine();
			int integerValue1 = getValue(node1);
			int integerValue2 = getValue(node2);
			adjMat[integerValue1][integerValue2] = 1;
			adjMat[integerValue2][integerValue1] = 1;
			break;
			default:
				System.out.println("enter a valid choice");
		}
	}
	public static int getValue(String str1)
	{
		int index = 0;
		for(int i=0;i<nodeArray.length;i++)
		{
			if(nodeArray[i].getString() == str1)
			{
				index = i;
				break;
			}
		}
		return index;
	}
}
