import static java.lang.System.*;
import java.io.*;
class BufferedInputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		InputStream is = new FileInputStream("E:/newmade.txt");
		BufferedInputStream bis = new BufferedInputStream(is);

	}
}