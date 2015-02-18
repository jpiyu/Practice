import java.io.*;
import java.util.*;

public class InsertionSortPart2 {
	static int changes;
    public static void insertionSortPart2(int[] ar)
    {       
    	for(int j=1;j<ar.length;j++)
    	{
    		int a = ar[j];
    		for(int i=0;i<j;i++)
    		{
    			if(ar[i] > ar[j])
    			{
    				int temp = ar[i];
    				ar[i] = ar[j];
    				ar[j] = temp;
    				changes++;
    			}
    		}
    		//printArray(ar);
    	}
    	System.out.println(changes);
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
       //printArray(ar);            
    }    
    /*private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }*/
}
