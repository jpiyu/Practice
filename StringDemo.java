import static java.lang.System.*;
class StringDemo
{
	public static void main(String[] args)
	{
		String str = "112233";
		int length = str.length();
		int hlength = length/2;
		String half = str.substring(0,hlength);
		System.out.println(
			half);
	}
}