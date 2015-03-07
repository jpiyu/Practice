import static java.lang.System.*;
class A
{
 	int i;
}
class B extends A
{
	int i = 4;
}
class ReferenceDemo3
{
	public static void main(String[] args)
	{
		A a = new B();
		a.i = 9;
		System.out.println(a.i);

	}
}
