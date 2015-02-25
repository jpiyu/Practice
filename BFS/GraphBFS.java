package BFS;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
class Vertex
{
	int value;
	boolean visited;
	Vertex(int value,boolean visited)
	{
		this.value = value;
		this.visited = visited;
	}
}
class Graph
{
	Vertex[] vertexList;
	int totalInsertedVertices;
	int[][] adjMatrix;
	java.util.Queue<Integer> queue;
	Graph(int totalVertices)
	{
		vertexList = new Vertex[totalVertices];
		totalInsertedVertices = 0;
		adjMatrix = new int[totalVertices][totalVertices];
		initialize(adjMatrix);
		queue = new LinkedList<Integer>();
	}
	public void initialize(int[][] adjMatrix)
	{
		for(int i=0;i<adjMatrix.length;i++)
		{
			for(int j=0;j<adjMatrix[0].length;j++)
			{
				this.adjMatrix[i][j] = 0;
			}
		}
	}
	public void addVertex(int val)
	{
		vertexList[totalInsertedVertices++] = new Vertex(val, false);
	}
	public void addEdge(int source,int destination)
	{
		adjMatrix[source][destination] = 1;
		adjMatrix[destination][source] = 1;
	}
	public void showAdjointMatrix()
	{
		for(int i=0;i<adjMatrix.length;i++)
		{
			for(int j=0;j<adjMatrix[0].length;j++)
			{
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
public class GraphBFS {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of vertices");
		int vertices = Integer.parseInt(br.readLine());
		Graph g = new Graph(vertices);
		System.out.println("now entering the vertices");
		for(int i=0;i<vertices;i++)
		{
			g.vertexList[i] = new Vertex(i,false);
		}
		System.out.println("Lets enter the edges");
		System.out.println("Enter the number of edges");
		int edges = Integer.parseInt(br.readLine());
		while(edges > 0)
		{
			String[] str = br.readLine().split(" ");
			g.addEdge(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
			edges--;
		}
		g.showAdjointMatrix();
	}
}
