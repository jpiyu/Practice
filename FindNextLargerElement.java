import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindNextLargerElement {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		char[] c = br.readLine().toCharArray();
		int[] arr = new int[c.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(c[i] - '0');
		}
		int i=0,j=0;
		for(i=arr.length-1;i>=0;i--)
		{
			if(arr[i-1] < arr[i])
			{
				break;
			}
		}
		int digit = arr[i-1];
		//System.out.println(digit);
		int digit2 = arr[i];
		//System.out.println(digit2);
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[j] < digit2 && arr[j] > digit)
			{
				digit2 = arr[j];
				//System.out.println(digit2);
			}
		}
		//System.out.println(digit2);
		System.out.println(j);
		int temp = arr[i-1];
		arr[i-1] = arr[j-1];
		arr[j-1] = temp;
		Arrays.sort(arr,3,arr.length);
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
	}
}
