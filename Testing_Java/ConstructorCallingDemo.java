import static java.lang.System.*;
class A
{
	A()
	{
		System.out.println("Inside the Constructor");
	}
	A(String s)
	{
		System.out.println(s);
	}
}
class ConstructorCallingDemo
{
	public static void main(String[] args)
	{
		A a = new A();
	//	a.A();                  //WE CANNOT CALL THE CONSTRUCTOR LIKE THIS , CONSTRUCTOR IS ONLY CALLED WHEN THE 'NEW' IS FOUND
	//	a.A("piyush");          //WE CANNOT CALL A CONSTRUCTOR LIKE THIS , CONSTRUCTOR IS CALLED ONLY WHEN THE 'NEW' IS FOUND//
	}
}