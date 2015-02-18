import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class RoyAndProfilePictures {
	static int y,testCases,size;
	static int[][] array;
	public static void main(String[] args)
	{
		//Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		size = Integer.parseInt(br.readLine());
		testCases = Integer.parseInt(br.readLine());
		y = 0;
		array = new int[testCases][2];
		while(y < testCases)
		{
			String[] str = br.readLine().split(" ");
			for(int i=0;i<2;i++)
			{
				array[y][i] = Integer.parseInt(str[i]);
			}
			y++;
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		y = 0;
		while(y < testCases)
		{
			if(array[y][0] < size || array[y][1] < size)
			{
				System.out.println("UPLOAD ANOTHER");
				y++;
				continue;
			}
			else if(array[y][0] == size && array[y][1] == size)
			{
				System.out.println("ACCEPTED");
			}
			else if(array[y][0] == array[y][1])
			{
				System.out.println("ACCEPTED");
			}
			else if(array[y][0] > size || array[y][1] > size)
			{
				System.out.println("CROP IT");
			}
			y++;
		}
	}
}
