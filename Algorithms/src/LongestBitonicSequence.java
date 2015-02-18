import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class LongestBitonicSequence {
	public static void main(String[] args)
	{
		int arr[] = new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int length = arr.length;
		int lis[] = new int[length];
		int lds[] = new int[length];
		for(int i=0;i<length;i++)
		{
			lis[i] = 1;
			lds[i] = 1;
		}
		for(int i=1;i<length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(lis[i] < lis[j]+1 && arr[i] > arr[j])
				{
					lis[i] = lis[j]+1;
				}
			}
		}
		for(int i=length-2;i>=0;i--)
		{
			for(int j=length-1;j>i;j--)
			{
				if(arr[i] > arr[j] && lds[i] < lds[j]+1)
				{
					lds[i] = lds[j]+1;
				}
			}
		}
		Arrays.sort(lis);
		Arrays.sort(lds);
		System.out.println(lis[length-1]);
		System.out.println(lds[length-1]);
		System.out.println((lis[length-1]+lds[length-1])-1);
	}
}
