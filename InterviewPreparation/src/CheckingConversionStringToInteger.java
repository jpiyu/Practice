import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class CheckingConversionStringToInteger {
	public static void main(String[] args) throws IOException {
		String str = "";
		int a[] = new int[10];
		int i=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(str);
		//System.out.println(list);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = (String) iterator.next();
			try {
				a[i] = Integer.parseInt(next);
				i++;
			} catch (Exception e) {
				continue;
			}
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[i]);
		}
	}
}
