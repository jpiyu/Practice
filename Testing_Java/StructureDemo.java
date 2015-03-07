import static java.lang.System.*;

import java.util.Scanner;
import  java.util.Scanner.*;


class StructureDemo
{
	public static void main(String[] main)
	{
		Scanner s = new Scanner(System.in);
		String data[] = new String[5];

		for ( int i = 0 ; i<5 ; i++)
		{
			data[i] = s.next();
		}

		for ( int i = 0;i<5; i++)
		{
			System.out.println(data[i]);
		}
	}
}