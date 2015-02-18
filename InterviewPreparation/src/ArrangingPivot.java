/**
 * this is a program to select the first number as the pivot element and setting
 * it in its right position so that all the elements lesser than it are to its
 * left and greater to it are to its right
 **/
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class ArrangingPivot {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		int pivot = arr[0];
		ArrayList<Integer> smallerElements = new ArrayList<>();
		ArrayList<Integer> largerElements = new ArrayList<>();
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] < pivot)
			{
				smallerElements.add(arr[i]);
			}
			else
				largerElements.add(arr[i]);
		}
		
		for(int i=0;i<smallerElements.size();i++)
		{
			arr[i] = smallerElements.get(i);
		}
		arr[smallerElements.size()] = pivot;
		for(int i=0;i<largerElements.size();i++)
		{
			arr[smallerElements.size()+i] = largerElements.get(i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
