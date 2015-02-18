import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CommonChild {
	static ArrayList<Character> list = new ArrayList<Character>();
	public static void main(String[] args) throws Exception
	{
		int length = 0;
		int max = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		for(int i=0;i<str1.length();i++)
		{
			list.add(str1.charAt(i));
		}
		//System.out.println(list);
		//System.out.println(str2.length());
		for(int i=0;i<str2.length();i++)
		{
			//System.out.println("inside outer for");
			//System.out.println(str2.charAt(i));
			max = 0;
			if(list.contains(str2.charAt(i)))
			{
				length = 1;
				if(length > max)
				{
					max = length;
				}
				for(int j=i+1;j<str2.length();j++)
				{
					//System.out.println("inside inner for");
					if(i==j)
					{
						continue;
					}
					if(list.contains(str2.charAt(j)))
					{
						length++;
						if(length > max)
						{
							max = length;
						}
						//System.out.println(length);
					}
					/*if(!list.contains(str2.charAt(j)))
					{
						//System.out.println("doesn't contains");
						//break;
					}*/
					
				}
			}
			System.out.println(length);
		}
		System.out.println("the maximum subarray length" + length);
	}
}
