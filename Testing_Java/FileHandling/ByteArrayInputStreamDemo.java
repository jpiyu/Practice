import static java.lang.System.*;
import java.io.*;
class ByteArrayInputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		InputStream is = new ByteArrayInputStream("E:/newmade.txt");
		byte[] b = is.getBytes();
		is.read(b);
	}
}