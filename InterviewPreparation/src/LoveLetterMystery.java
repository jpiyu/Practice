import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class LoveLetterMystery {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		long[] finalArray = new long[testCases];
		String[] array = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			array[i] = br.readLine();
		}
		for (int j = 0; j < testCases; j++) {
			String str = array[j];
			char newArray[] = str.toCharArray();
			long length = (newArray.length-1);
			long halfLength = length / 2;
			//long copyLength = length;
			for(int k=0;k<=halfLength;k++)
			{
				char c1 = newArray[k];
				char c2 = newArray[(int)(length-k)];
				int valueOfc1 = (int)c1;
				int valueOfc2 = (int)c2;
				int difference = valueOfc2 - valueOfc1;
				if(difference < 0)
				{
					difference = (~difference) + 1;
				}
				finalArray[j] = finalArray[j] + difference;
				/*if(finalArray[j] < 0)
				{
					finalArray[j] = (~finalArray[j]) + 1;
				}*/
				
			}
		}
		for(int i=0;i<finalArray.length;i++)
		{
			System.out.println(finalArray[i]);
		}
	}

}
