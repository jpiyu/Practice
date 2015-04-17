import static java.lang.System.*;
import java.io.*;
import java.util.*;
class Node
{
	int xorValue;
	ArrayList<Integer> list = new ArrayList<Integer>();
}
public class PandaAndXORViaClass {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		String[] str = br.readLine().split(" ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
	}
}
