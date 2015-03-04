import static java.lang.System.*;
import java.io.*;
public class MultiplyingBy7Demo {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = (n << 3) - n;
		System.out.println(result);
	}
}
