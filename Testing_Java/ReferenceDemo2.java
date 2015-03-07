import static java.lang.System.*;
class A       // final can be stated in the start of the declaration of class A also //
{
	int i = 5;
}
class ReferenceDemo2
{
	public static void main(String[] args)
	{
		final A a = new A();
		a.i = 1;
		System.out.println(a.i);
	}
}