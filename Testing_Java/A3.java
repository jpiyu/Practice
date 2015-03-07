import static java.lang.System.*;
class A3
{

	A3()
	{
		out.println("Inside the constructor of A");
	}
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			out.println(i);
		}

	}
}
class TwoMainDemo
{
	TwoMainDemo()
	{
		out.println("inside the constructor of twomaindemo");
	}
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			out.println("see");
		}

	}
}
