import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class InsertionSort3 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		int length = Integer.parseInt(br.readLine());
		int[] array = new int[length];
		for(int i=0;i<array.length;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}
		for(int i=1;i<array.length;i++)
		{
			int num = i;
			int temp = array[num];
			while(temp < array[num-1] && num > 0)
			{
				array[num] = array[num-1];
				num--;
			}
			array[num] = temp;
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}
