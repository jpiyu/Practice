import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class Fill2InstancesOfASameDigit {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the range");
		int range = Integer.parseInt(br.readLine());
		int[] array = new int[2*range];
		for(int i=0;i<array.length;i=i+2)
		{
			array[i] = range--;
			array[i+1] = array[i];
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		
	}
}
