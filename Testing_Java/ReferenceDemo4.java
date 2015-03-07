import static java.lang.System.*;
class A
{
	public void hello()
	{
		System.out.println("in hello");
	}
}
class B extends A
{
	public void hi()
	{
		System.out.println("inside hi");
	}
}
class ReferenceDemo4
{
	public static void main(String[] args)
	{
		A a = new B();
		a.hi();
	}
}