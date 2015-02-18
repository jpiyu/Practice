import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AkashAndAssignment {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(" ");
		//int lengthOfString = Integer.parseInt(br.readLine());
		int testCases = Integer.parseInt(arr1[1]);
		String str = br.readLine();

		while(testCases > 0)
		{
			String[] arr = br.readLine().split(" ");
			int[] arr2 = new int[arr.length];
			for(int i=0;i<arr2.length;i++)
			{
				arr2[i] = Integer.parseInt(arr[i]);
			}
			if(arr2[2] > (arr2[1]-arr2[0]+1))
			{
				System.out.println("Out of range");
			}
			else
			{
			String sub = str.substring(arr2[0]-1,arr2[1]-1);
			System.out.println(sub.charAt(arr2[2]-1));
			}
			testCases--;
		}
	}
}
