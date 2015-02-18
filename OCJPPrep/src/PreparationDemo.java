import static java.lang.System.*;

import java.io.*;

public class PreparationDemo {
	public static void main(String[] args) throws IOException {
		String s = new String();
		int i=0;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		s = b.readLine();
		StringBuffer sb = new StringBuffer();
		char arr[] = s.toCharArray();
		//System.out.println(arr);
		while(i < arr.length)
		{
			sb.append(arr[i]);
			i++;
		}
		System.out.println(sb);
	}
}
