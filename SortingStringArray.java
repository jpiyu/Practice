import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SortingStringArray {
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = new String[5];
		for(int i=0;i<5;i++)
		{
			array[i] = br.readLine();
		}
		Arrays.sort(array);
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}
	}
}
