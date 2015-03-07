// this program shows that the return type of a particular method can be changed in overloading //

import static java.lang.System.*;
class A
{
	void eat()
	{
		System.out.println("the default method");
	}
	int eat(int i)
	{
		return i*5;
	}
}
class MethodOverloadingDemo
{
	public static void main(String[] args)
	{
		A a = new A();
		a.eat();
		System.out.println(a.eat(5));
	}
}