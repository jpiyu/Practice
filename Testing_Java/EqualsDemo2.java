import static java.lang.System.*;
class EqualsDemo2
{
	public static void main(String[] args)
	{
		String str1 = "piyush";
		String str2 = new String();
		str2 = str1;
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str2))
		System.out.println("yes they are equal");
	}
}