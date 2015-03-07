import static java.lang.System.*;
import java.util.Arrays;
class ArraySort
{
	public static void main (String] args)
	{
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = (5-i);
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}