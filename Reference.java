class C
{
	C()
	{
		System.out.println("inside C's constructor");
	}
}
class B extends C
{
	B()
	{
		System.out.println("inside B's constructor");
	}
}
class A extends B
{
	int x;
	A()
	{
		System.out.println("inside A's constructor");
	}
	A(String str)
	{
		System.out.println(str);
	}
	static
	{
		System.out.println("static initialization block");
	}
	{
		System.out.println("instance initialization block");
	}
}
class Reference
{
	public static void main(String[] args)
	{
		A a = new A();
		A b = new A();
		A c = new A("hello");
	}
}