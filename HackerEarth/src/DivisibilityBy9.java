import static java.lang.System.*;
import java.util.*;
class A
{
	int num;
	int sum;
	A(int num)
	{
		this.num = num;
	}
	public String checkDivisibility(int num)
	{
		while(num > 0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		if(sum == 9)
		{
			return "Divisible";
		}
		else
			return "Not Divisible";
	}
}
public class DivisibilityBy9 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		A a= new A(num);
		System.out.println(a.checkDivisibility(a.num));
	}
}
