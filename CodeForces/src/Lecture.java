import java.io.*;
import java.util.*;
public class Lecture {
	static int testCases,languageCount,professorWordcount;
	static LinkedList<String> list = new LinkedList<>();
	static String[] convertedArray;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		//Scanner s = new Scanner(System.in);
		String[] array = br.readLine().split(" ");
		languageCount = Integer.parseInt(array[1]);
		professorWordcount = Integer.parseInt(array[0]);
		//arr = new String[languageCount*2];
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<languageCount;i++)
		{
			String[] str = br.readLine().split(" ");
			list.add(str[0]);
			list.add(str[1]);
		}
		/*System.out.println(list);
		System.out.println(list.get(0));
		int y =0;*/
		String[] stringToConvert = br.readLine().split(" ");
		convertedArray = new String[stringToConvert.length];
		for(int i=0;i<stringToConvert.length;i++)
		{
			int index = list.indexOf(stringToConvert[i]);
			String str = list.get(index+1);
			if(str.length() < stringToConvert[i].length())
			{
				convertedArray[i] = str;
			}
			else
			{
				convertedArray[i] = stringToConvert[i];
			}
		}
		for(int i=0;i<convertedArray.length;i++)
		{
			System.out.print(convertedArray[i] + " ");
		}
	}
}
