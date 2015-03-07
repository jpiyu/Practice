import static java.lang.System.*;
class A
{
	static void print()
	{
		System.out.println("Inside the class A");
	}
}
class StaticConceptDemo extends A
{
	public static void main(String[] args)
	{

		print();
	}
}