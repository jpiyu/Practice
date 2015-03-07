import static java.lang.System.*;
class A
{
	void Hello()
	{
		System.out.println("Inside the Hello Method");
	}
}
class B extends A
{
	void Hi()
	{
		System.out.println("Inside the Hi Method");
	}
}
class ObjectCasting
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		a.Hello();
		B b = (B) a;
		b2.Hi();
	}
}