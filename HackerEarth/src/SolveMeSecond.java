import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SolveMeSecond {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(br.readLine());
		int y =0;
		while(y <testCases)
		{
			String[] arr = br.readLine().split(" ");
			int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
			System.out.println(sum);
			y++;
		}
	}
}
