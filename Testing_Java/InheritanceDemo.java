import static java.lang.System.*;
class A
{
	A()
	{
		out.println("A");
	}
}
class B extends A
{
	B()
	{
		out.println("B");
	}
}
class C extends B
{
	C()
	{
		out.println("C");
	}
}
class InheritanceDemo
{
	public static void main(String[] args)
	{
		C c = new C();
	}
}

