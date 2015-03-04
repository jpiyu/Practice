import java.io.*;
public class CountNumberNotHaving3 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double number = Double.parseDouble(br.readLine());
		double totalNumber = count(number);
		System.out.println(totalNumber);
	}
	public static double count(double number)
	{
		double digit = 0;
		double msd = 0;
		if(number < 3)
		{
			return number;
		}
		if(number > 3 && number < 10)
		{
			return number-1;
		}
		else
		{
			while(number > 0)
			{
				number = number/10;
				digit++;
				if(number > 0 && number < 9)
				{
					msd = number;
				}
			}
			return count(msd) * count(Math.pow(10, digit-1)-1) + count(msd) + count(number % (Math.pow(10, digit-1)));
		}
	}
}
