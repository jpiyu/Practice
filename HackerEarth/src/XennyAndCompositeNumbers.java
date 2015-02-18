import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class XennyAndCompositeNumbers {
	static int testCases;
	static int num;
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		//Scanner s = new Scanner(System.in);
		testCases = Integer.parseInt(br.readLine());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		int y =0;
		while(y <testCases)
		{
			try
			{
			num = Integer.parseInt(br.readLine());
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			int i =0;
			for(i=num+1;i<Integer.MAX_VALUE;i++)
			{
				if(isPrime(i))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			System.out.println(i);
			y++;
		}
	}
	public static boolean isPrime(int num) {
		if(num == 1)
		{
			return true;
		}
        if ( num < 2 ) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ( num % i == 0 ) {
                return false;
            }
        }
        return true;
    }

}
