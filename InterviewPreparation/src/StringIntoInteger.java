import static java.lang.System.*;
import java.io.*;

public class StringIntoInteger {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			str = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int a = Integer.parseInt(str);
		System.out.println(a);
	}

}
