import static java.lang.System.*;
class B
{
	static void test1()
	{
		System.out.println("hello");
		test2();
		System.out.println("world");
	}
	static void test2()
	{
		System.out.println("india");
	}
	public static void main(String[] args)
	{
		System.out.println("DAD");
		test1();
		return;
	}
}
