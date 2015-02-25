package FindingConnectivity;
import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class FindingConnectivity {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of vertices");
		int vertices = Integer.parseInt(br.readLine());
		Graph g2 = new Graph(vertices); // the graph class is in the GraphBFS program //
		for(int i=0;i<4;i++)
		{
			g2.vertexList[i] = new Vertex(i,true);
		}
		System.out.println("Enter the number of edges");
		int numberOfEdges = Integer.parseInt(br.readLine());
		int counter = numberOfEdges;
		while(counter > 0)
		{

			String[] str = br.readLine().split(" ");
			g2.addEdge(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
			counter--;
		}
		g2.showAdjointMatrix();
		System.out.println("now finding out other connectivities");
		Thread.currentThread().sleep(2000);
		for(int row=0;row<numberOfEdges;row++)
		{
			for(int col=0;col<numberOfEdges;col++)
			{
				if(g2.adjMatrix[row][col] == 1)
				{
					for(int i=0;i<numberOfEdges;i++)
					{
						if(g2.adjMatrix[i][row] == 1)
						{
							//System.out.println("here");
							g2.adjMatrix[i][col] = 1;
						}
					}
				}
			}
		}
		g2.showAdjointMatrix();
	}
}
