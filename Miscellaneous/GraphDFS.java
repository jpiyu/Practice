import static java.lang.System.*;
import java.util.*;
import java.io.*;
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
	Vertex vertexList[];
	int adjMatrix[][];
	Stack<Integer> stack;
	int numberOfVertexes;
	Graph(int vertexes)
	{
		vertexList = new Vertex[vertexes];
		adjMatrix = new int[vertexes][vertexes];
		this.initialize(adjMatrix);
		stack = new Stack<Integer>();
		numberOfVertexes = 0;
	}
	public void initialize(int adjMatrix[][])
	{
		for(int i=0;i<adjMatrix.length;i++)
		{
			for(int j=0;j<adjMatrix[0].length;j++)
			{
				adjMatrix[i][j] = 0;
			}
		}
	}
	public void addVertex(int a)
	{
		vertexList[numberOfVertexes++] = new Vertex(a,false);
	}
	public void addEdge(int source,int destination)
	{
		adjMatrix[source][destination] = 1;
		adjMatrix[destination][source] = 1;
	}
	public void displayVertex(int v)
	{
		System.out.println("The value of the vertex is : " + vertexList[v].value);
	}
	public void dfs()
	{
		stack.push(0);
		vertexList[0].visited = true;
		displayVertex(0);
		while(!stack.empty())
		{
			int top = stack.peek();
			int v = getUnvisitedVertex(top);
			if(v == -1)
			{
				stack.pop();
			}
			else
			{
				stack.push(v);
				displayVertex(v);
				vertexList[v].visited = true;
			}
		}
		
	}
	public int getUnvisitedVertex(int vertex)
	{
		for(int i=0;i<=numberOfVertexes-1;i++)
		{
			if(vertexList[i].visited == false && adjMatrix[vertex][i] == 1)
			{
				return i;
			}
		}
		return -1;
	}
	public void printAdjointMatrix()
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

public class GraphDFS {
	public static void main(String[] args) throws Exception
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of vertices in the graph");
		//int numberOfVertices = Integer.parseInt(br.readLine());
		int numberOfVertices = 4;
		Graph g = new Graph(numberOfVertices);
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addEdge(0,1);
		g.addEdge(1,2);
		//g.addEdge(2,3);
		//g.addEdge(0,2);
		g.addEdge(0,3);
		g.printAdjointMatrix();
		System.out.println("Processing the Depth First Search");
		g.dfs();
	}
}
