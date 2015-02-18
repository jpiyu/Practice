import static java.lang.System.*;

import java.io.*;
import java.util.Scanner;
public class FindingKthElement {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String[] str1 = s.nextLine().split(" ");
		String[] str2 = s.nextLine().split(" ");
		int arr1[] = new int[str1.length];
		int arr2[] = new int[str2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = Integer.parseInt(str1[i]);
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr2[j] = Integer.parseInt(str2[j]);
		}
		int indexToFind = s.nextInt();
		int y =0;
		int i=0,j=0;
		int elementFound = 0;
		//while(y < indexToFind)
		//{
			while(i<arr1.length)
			{
				
				while(j<arr2.length)
				{
					
					if(arr1[i] < arr2[j])
					{
						//System.out.println(arr1[i] + " " + arr2[j]);
						elementFound = arr1[i];
						y++;
						i++;
					}
					else
					{
						elementFound = arr2[j];
						y++;
						j++;
					}
					if( y == indexToFind)
					{
						//System.out.println("inside the break check");
						break;
					}
				}
				if(y == indexToFind)
				{
					break;
				}
			}
		//}
			System.out.println(elementFound);
		
	}
}
