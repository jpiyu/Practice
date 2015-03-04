import java.io.*;
import java.util.*;
public class CheckingIfTwoStringsContainSameElements {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two strings one by one");
		char[] array1 = br.readLine().toCharArray();
		char[] array2 = br.readLine().toCharArray();
		int i=0,j=0;
		Arrays.sort(array1);
		Arrays.sort(array2);
		while(i<array1.length && j<array2.length)
		{
			if(array1[i] == array2[j])
			{
				j++;
				i++;
			}
			else 
			{
				break;
			}
		}
		if(i == j && i == array1.length)
		{
			System.out.println("both strings are anagrams");
			return ;
		}
		else
		{
			System.out.println("both strings are not anagrams");
			return;
		}
	}
}
