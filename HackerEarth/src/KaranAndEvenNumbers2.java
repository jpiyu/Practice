import java.io.BufferedReader;
import java.io.InputStreamReader;


public class KaranAndEvenNumbers2 {
	static BufferedReader br;
	static String[] line;
	public static void main(String args[]) throws Exception {

		br = new BufferedReader(new InputStreamReader(System.in));
		line = br.readLine().split(" ");
		for(int i=0;i<line.length;i++)
		{
			if(Integer.parseInt(line[i]) % 2 == 0)
			{
				System.out.println(Integer.parseInt(line[i]));
			}
		}
	}
}
