import static java.lang.System.*;

import java.io.*;
import java.util.*;

import javax.swing.InputMap;
public class RegularExpression {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		char[][] arrays = new char[testCases][];
		int y=0;
		String str[] = br.readLine().split("/.");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
}
