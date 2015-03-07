import static java.lang.System.*;
class CountingDigitsDemo
{
	public static void main(String[] args)
	{
		int num = 1000000005;
		int count  = 0;
		while(num > 0)
		{
			num = num / 10;
			count++;
			if(num == 0)
			break;
		}
		System.out.println(count);
	}
}