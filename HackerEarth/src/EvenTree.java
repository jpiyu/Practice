import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class EvenTree {
	public static void main(String[] arg) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int vertexs = Integer.parseInt(str[0]);
		int edges = Integer.parseInt(str[1]);
	}
}
class NodeClass
{
	char label;
	NodeClass(char c)
	{
		this.label = c;
	}
}
class Graph
{
	int vertexs,edges;
	Graph(int vertexs,int edges)
	{
		this.vertexs = vertexs;
		this.edges = edges;
	}
	int[][] adjMatrix = new int[vertexs][vertexs];
	NodeClass[] array = new NodeClass[edges];
}