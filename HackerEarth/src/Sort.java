import java.util.Scanner;
import java.util.*;

public class Sort {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int no = Integer.parseInt(s.nextLine());
		int arr[] = new int[no];
		for(int i=0;i<no;i++)
		{
			arr[i] = Integer.parseInt(s.nextLine());
		}
		Arrays.sort(arr);
		for(int i=0;i<no;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
