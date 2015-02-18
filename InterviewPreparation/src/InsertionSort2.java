import java.io.*;
import java.util.*;
public class InsertionSort2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.nextLine());
		int array[] = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = Integer.parseInt(s.nextLine());
		}
		
		for(int i=1;i<array.length;i++)
		{
			int temmp = array[i];
			int inner = i;
			while(inner > 0 && array[inner-1] > temmp)
			{
				array[inner] = array[inner-1];
				inner--;
			}
			array[inner] = temmp;
		}
		for(int j=0;j<size;j++)
		{
			System.out.println(array[j]);
		}
		
	}
}
