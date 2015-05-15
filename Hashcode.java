import static java.lang.System.*;
class Hashcode {
	public static void main(String[] args)
	{
		String str = new String("abcd");
		String str2 = new String("abcd");
		long code2 = str2.hashCode();
		long code = str.hashCode();
		out.println(code);
		out.println(code2);
	}
}