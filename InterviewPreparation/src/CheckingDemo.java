import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class CheckingDemo {
	public static void main(String[] args) throws Exception
	{
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str.length());
		char[] array = new char[str.length()];
		array = str.toCharArray();
		System.out.println(array.length);
		int a = -3;
		a = ~a;
		System.out.println(a+1);
		*/
		
		/*ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('b');
		System.out.println(list.size());
		System.out.println(list.get(0));
		*/
		
		/*String str = "122";
		System.out.println(str.length());
		
		int a = 0;         // also check for a = -1// remember this
		for(int i=0;i<a;i++)
		{
			System.out.println("hello");
		}*/
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		for(int i=1;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}
