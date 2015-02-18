import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class UtopianTree {
	public static void main(String[] args) throws Exception
	{
		int arr[];
		int finalLength[];
		int length = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		arr = new int[testCases];
		finalLength = new int[testCases];
		for(int i=0;i<testCases;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		int j=0;
		
		while(j < testCases)
		{
			int noOfCycles = arr[j];
			length = 1;
			while(noOfCycles > 0)
			{
				length = length*2;
				noOfCycles--;
				if(noOfCycles == 0)
				{
					break;
				}
				length = length +1;
				noOfCycles--;
			}
			finalLength[j] = length;
			j++;
		}
		for(int i=0;i<testCases;i++)
		{
			System.out.println(finalLength[i]);
		}
	}
}
