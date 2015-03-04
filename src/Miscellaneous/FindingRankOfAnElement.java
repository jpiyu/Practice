package Miscellaneous;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindingRankOfAnElement {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the first array");
		String[] str1 = br.readLine().split(" ");
		int[] arr1 = new int[str1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = Integer.parseInt(str1[i]);
		}
		String[] str2 = br.readLine().split(" ");
		int[] arr2 = new int[str2.length];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = Integer.parseInt(str2[i]);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int[] arr3 = new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				arr3[k++] = arr1[i++];
			}
			else if(arr1[i] > arr2[j])
			{
				arr3[k++] = arr2[j++];
			}
		} 
		if(i == arr1.length)
		{
			for(int l=j;l<arr2.length;l++)
			{
				arr3[k++] = arr2[l];
			}
		}
		else if(j == arr2.length)
		{
			for(int l=i;i<arr1.length;l++)
			{
				arr3[k++] = arr2[i++];
			}
		}
	    for(int l=0;l<k;l++)
		{
			System.out.println(arr3[l]);
		}
		System.out.println("Enter the element whose index is to be found");
		int number = Integer.parseInt(br.readLine());
		int index = 0;
		while(arr3[index] != number)
		{
			index++;
		}
		System.out.println("The index of " + number + " is " + index + " " + ":);)");
	}
}
