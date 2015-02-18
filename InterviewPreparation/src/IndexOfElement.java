import static java.lang.System.*;
import java.io.*;
public class IndexOfElement {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int size = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] array = new int[arr.length];
		for(int i=0;i<array.length;i++)
		{
			array[i] = Integer.parseInt(arr[i]);
		}
		/*
		for(Integer i : array)
		{
			System.out.println(i);
		}
		*/
		for(int j=0;j<array.length;j++)
		{
			if(array[j] == number)
			{
				System.out.println(j);
			}
		}
	}
}
