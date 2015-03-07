import static java.lang.System.*;
class B
{
	static void test1()
	{
		System.out.println("hello");
		test2();
	}
	static void test2()
	{
		System.out.println("india");
		test1();
	}
	public static void main(String[] args)
	{
		System.out.println("DAD");
		test1();

	}
}
