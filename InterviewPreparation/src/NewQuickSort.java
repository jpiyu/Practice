import static java.lang.System.*;

import java.io.*;
import java.util.*;

public class NewQuickSort {
	static ArrayList<Integer> smallerElements = new ArrayList<Integer>();
	static ArrayList<Integer> largerElements = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		//for (int j = 0; j < (n); j++) {
			quickSort(ar,1,4);
		//}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

	static void quickSort(int[] ar, int low,int up) {
		if(low<up)
		{
			int q = partition(ar,low,up);
			quickSort(ar,low,q-1);
			quickSort(ar,q+1,up);
		}
		
	}
	static int partition(int[] ar,int low,int up)
	{
		int x = ar[up];
		int i=low-1;
		for(int j=low;j<up-1;j++)
		{
			if(ar[j] <= x)
			{
				i++;
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		int temp = ar[i+1];
		ar[i+1] = ar[up];
		ar[up] = temp;
		return i;
	}
}
