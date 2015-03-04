import static java.lang.System.*;
import java.io.*;
class GetReader
{
	public BufferedReader getReader()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br;
	}
}
public class BabyLonianMethodOfSquareRoot {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = (new GetReader()).getReader();
		int number = Integer.parseInt(br.readLine());
		float squareRoot = getSquareRoot(number);
		System.out.println(squareRoot);
	}
	public static float getSquareRoot(int number)
	{
		float x = number;
		float y = 1;
		float e = 0.000001f;
		while(x - y > e)
		{
			x = (x+y)/2;
			y = number/x;
		}
		return x;
	}
}
