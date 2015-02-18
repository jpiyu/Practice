import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SumOfProducts {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(br.readLine());
		int y =0;
		while(y <testCases)
		{
			long num = Integer.parseInt(br.readLine());
			long sum = 0;
			for(long i =1;i<=num;i++)
			{
				long result = num/i;
				sum = sum + (result*i);
			}
			System.out.println(sum);
			y++;
		}
	}
}
