import static java.lang.System.*;
class Hello
{
	static 
	{
		System.out.println("inside hello's static block");
	}
	{
		System.out.println("inside hello's initialization block");
	}
	Hello()
	{
		System.out.println("inside hello's constructor");
	}
}
class A
{
	A()
	{
		System.out.println("A's constructor");
	}
	{
		System.out.println("inside a's initialization block");
	}
	static 
	{
		System.out.println("inside a's static block");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B's constructor");
	}
	{
		System.out.println("inside b's initialization block");
	}
	static
	{
		System.out.println("inside b's static block");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C's constructor");
	}
	{
		System.out.println("inside c's initialization block");
	}
	static
	{
		System.out.println("inside c's static block");
	}
}
class InheritanceDemo
{
	public static void main(String[] args)
	{
		C c = new C();
		Hello h = new Hello();
	}
}