import static java.lang.System.*;
import java.io.*;
import java.util.*;
class Array
{
	int[] arr;
	int numberOfElements;
	Array(int size)
	{
		arr = new int[size];
		numberOfElements = 0;
	}
	public void add(int element)
	{
		arr[numberOfElements++] = element;
	}
	public int getSize()
	{
		return numberOfElements;
	}
}
public class SwapArrayInWaveForm {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array");
		int nElems = s.nextInt();
		Array a = new Array(nElems);
		int i=0;
		while(i < nElems)
		{
			a.add(s.nextInt());
			i++;
		}
		/*System.out.println(a.getSize());
		for(int j=0;j<a.getSize();j++)
		{
			System.out.println(a.arr[j]);
		}*/
		
		swapArrayInWaveForm(a.arr);
		
	}
	static void swapArrayInWaveForm(int[] arr)
	{
		int temp = 0;
		for(int i=1;i<arr.length;i=i+2)
		{
			if(arr[i] < arr[i-1])
			{
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
			if(arr[i] > arr[i+1])
			{
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j] + " ");
		}
	}
}
