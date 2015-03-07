import static java.lang.System.*;
class StaticConceptDemo2
{
	static int i = setI();
	static int setI()
	{
		System.out.println("inside setI()");
		return 10;
	}
	public static void main(String[] arsg)
	{
		System.out.println(i);
	}
}