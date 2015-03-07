import static java.lang.System.*;
import java.io.*;
class InputStreamDemo2
{
	public static void main(String[] args) throws Exception
	{
		InputStream f = new FileInputStream("E:/Testing/i1.java");
		int size = f.available();
		byte[] b = new byte[size];
		int r = f.read(b);
		String str = new String(b,0,size); // converts the number of bytes read into a String//
		System.out.println(str);
		System.out.println(str.length());
	}
}