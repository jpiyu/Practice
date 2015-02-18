import java.util.*;

public class QuickSort {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	static void quickSort(int[] ar,int low, int up) {
		int pivloc = partition(ar,low,up);
		if(low>=up)
		{
			return;
		}
		quickSort(ar,low,pivloc-1);
		quickSort(ar,pivloc+1,up);
	}
	static int partition(int[] ar,int low,int up)
	{
		int pivloc =low,i=low+1,j=up;
		while(i<=j)
		{
			while((ar[i] < ar[pivloc]) && (i< up))
			{
				i++;
			}
			while(ar[i] > ar[pivloc])
			{
				j--;
			}
			if(i<j)
			{
				int temp;
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				i++;
				j--;
			}
			else
			{
				i++;
			}
		}
		ar[low] = ar[j];
		ar[j] = ar[pivloc];
		return j;
	}
	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar,0, n-1);
		printArray(ar);
	}
}
