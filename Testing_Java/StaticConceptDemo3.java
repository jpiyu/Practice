import static java.lang.System.*;
class A
{
	public static void hello()
	{
		out.println("hello");
	}
	public static void hello(int i)
	{
		out.println(i);
	}
}
class StaticConceptDemo3
{
	public static void main(String[] args)
	{
		A a = new A();
		a.hello();
		a.hello(5);
	}
}