import static java.lang.System.*;

class A
{
	 A()
	{
		out.println("Basic constructor");
	}
	A(int i)
	{
		out.println(i);
	}
}
class ConstructorsDemo
{
	public static void main(String[] args)
	{
		A a = new A();
		A b = new A(10);        // its conceptual that this would be an another object //
	}
}