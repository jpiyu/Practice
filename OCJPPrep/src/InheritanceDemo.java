import static java.lang.System.*;
class A2
{
	public void buck()
	{
		System.out.println("inside buck");
	}
}
class B2 extends A2
{
	public void eat()
	{
		System.out.println("inside eat");
	}
}
public class InheritanceDemo {
	public static void main(String[] args)
	{
		A2 a = new B2();
		a.buck();
	}
}
