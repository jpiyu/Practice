import static java.lang.System.*;
class WrapperDemo
{
	public static void main(String[] args)
	{
		Integer i = new Integer("42");
		int j = i.intValue();
		System.out.println(i);
		System.out.println(j);
		if (i.equals(j))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}