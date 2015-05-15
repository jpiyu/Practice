import static java.lang.System.*;
interface hello
{
	public void show(A a);
}
class A implements hello
{
	A()
	{
		System.out.println("inside A's constructor");
	}
	public void show(A a)
	{
		System.out.println(a.hashCode());
	}
}

public class InterfaceDemo {
	public static void main(String []args)
	{

		A a = new A();
		A b;
		b = a;
		a.show(a);
		a.show(b);
	}
}
