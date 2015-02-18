import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class MehtaAndSubarrays {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String array[] = br.readLine().split(" ");
		int arr[] = new int[array.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(array[i]);
		}
		int sum = 0;
		int length,maxLength =0;
		int y =0;
		while(y<arr.length)
		{
		for(int j=y;j<arr.length;j++)
		{
			length = 1;
			sum = arr[j];
			while(sum > 0)
			{
				
				sum = sum + arr[j];
				length ++;
			}
			if(length > maxLength)
			{
				maxLength = length;
			}
		}
		y++;
		}
		System.out.println(maxLength);
	}
}
