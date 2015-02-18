
import java.util.*;
import java.io.*;
public class AlternatingCharacters {
	static ArrayList<Character> list;
	static int numberOfDeletions;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		long[] finalArray = new long[testCases];
		String[] array = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			array[i] = br.readLine();
		}
		finalArray = new long[testCases];
		for (int j = 0; j < testCases; j++) {
			numberOfDeletions = 0;
			String str = array[j];
			list = new ArrayList<Character>();
			for(int k=0;k<str.length();k++)
			{
				list.add(str.charAt(k));
			}
			for(int k=0;k<(list.size()-1);k++)
			{
				if(list.get(k) == list.get(k+1))
				{
					list.remove(k+1);
					numberOfDeletions++;
					k--;
				}
				finalArray[j] = numberOfDeletions;
			}
		}
		for(int l=0;l<finalArray.length;l++)
		{
			System.out.println(finalArray[l]);
		}
	}

}
