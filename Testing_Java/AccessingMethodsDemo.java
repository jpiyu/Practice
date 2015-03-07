import static java.lang.System.*;
class A
{
	public void print()
	{
		System.out.println("Hello you are in class A");
	}
}
class B
{
	A a;
	B(A a)
	{
		this.a = a;
	}
	public void print()
	{
		System.out.println("Hello you are now in class B");

	}
}
class MethodsAccessingDemo
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B(a);
		b.print();
	}
}
