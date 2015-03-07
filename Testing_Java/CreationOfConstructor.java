//IMPORTANT CONCEPT : THE COMPILER WILL MAKE A DEFAULT CONSTRUCTOR IN THE CASE WHEN THERE IS NO CONSTRUCTOR SUPPLIED //E

import static java.lang.System.*;

class A
{
	A(String s)
	{
		System.out.println(s);
	}
}
class CreationOfConstructor
{
	public static void main(String[] args)
	{
		A a = new A();
	}
}