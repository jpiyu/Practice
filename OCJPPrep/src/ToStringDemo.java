import static java.lang.System.*;
class NewA
{
	NewA()
	{
		System.out.println("inside A's constructor");
	}
	public String toString() {
		return "hello piyush" + 123; 
	}
}
public class ToStringDemo {
	public static void main(String[] args)
	{
		NewA a = new NewA();
		System.out.println(a);
	}

}
