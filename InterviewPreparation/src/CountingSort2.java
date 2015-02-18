import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class CountingSort2 {
	static HashMap<Integer,Integer> map = new HashMap<>();
	static Set<Integer> set = new TreeSet<>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] array = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		int max = array[0];
		//for(int i=0;i<array.length;i++)
		//{
			
			for(int j=1;j<array.length;j++){
				if(array[j] > max)
				{
					max = array[j];
				}
			}
		//}
		System.out.println(max);
		
	}
}
