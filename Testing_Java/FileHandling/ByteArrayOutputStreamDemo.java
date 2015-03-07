import static java.lang.System.*;
import java.io.*;
class ByteArrayOutputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		OutputStream os = new FileOutputStream("E:/outputfile.txt");
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		String str = "hello my name is piyush joshi";
		byte[] b = str.getBytes();
		bs.write(b);
		bs.writeTo(os);
		bs.close();
		os.close();
	}
}