import static java.lang.System.*;
class A
{
	public static void test()
		{
			System.out.println("inside the method test()");
	}
	static
	{
		System.out.println("inside the static block of class A");
	}

}
class StaticDemo
{
	public static void main(String[] args)
	{
	A a = new A();
	}
}
