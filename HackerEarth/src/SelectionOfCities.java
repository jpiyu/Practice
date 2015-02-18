import java.io.BufferedReader;
import java.io.InputStreamReader;

class SelectionOfCities 
{
	public static long binpow (long a, long n) 
	{
		if (n == 0)
		{
			return 1;
		}
		
		if (n % 2 == 1)
		{
			return (binpow (a, n-1) * a) % 1000000007;
		}
		else 
		{
			long b = binpow (a, n/2);
			return (b * b) % 1000000007;
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) 
		{
			long n = Long.parseLong(br.readLine());
			System.out.println(binpow(2,n)-1);
		}
	}
}