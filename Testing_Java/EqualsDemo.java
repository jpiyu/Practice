import static java.lang.System.*;
class A
{
	int i = 10;
}
class EqualsDemo
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3;
		a3 = a1;                // try the next line for all possible combinations //
		if(a2.equals(a3))
		System.out.println(1);
	}
}