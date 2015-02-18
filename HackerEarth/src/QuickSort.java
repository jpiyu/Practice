
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class QuickSort {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int x = 0; x < T; x++) {
       		
       		int N = sc.nextInt();
       	 	int[] boys = new int[N];
        	int[] girls = new int[N];
        
        	for(int i = 0; i < N; i++) {
        		boys[i] = sc.nextInt();
        	}	
        	
        	for(int i = 0; i < N; i++) {
        		girls[i] = sc.nextInt();
        	}
        	
        	quickSort(boys, 0, N-1);
        	quickSort(girls, 0, N-1);
        	int matches = 0;
        	
        	for(int i = 0; i < N; i++) {
        		if (boys[i] % girls[N-i-1] == 0 || girls[N-i-1] % boys[i] == 0) { matches++; }
        	}        	
        	
        	System.out.println(matches);
        }
        
    }
    
    
	static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
}
