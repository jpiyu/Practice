import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SplitThePhoneNumbers {
	static 	String []stringArray;

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			String str = br.readLine();
			if(str.contains(" "))
			{
				stringArray = str.split(" ");
			}
			else if(str.contains("-"))
			{
				stringArray = str.split("-");
			}
			System.out.println("CountryCode=" + stringArray[0] + "," + "LocalAreaCode=" + stringArray[1] + "," + "Number=" + stringArray[2]);
			testCases--;
		}
	}
}
