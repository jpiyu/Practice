import static java.lang.System.*;
import java.io.*;
class OutputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		String arr = "12345";
		OutputStream f = new FileOutputStream("E:/newmade.txt", true);
		byte[] b = arr.getBytes();
		for(int i=0; i<arr.length(); i++)
		{
			f.write(b[i]);
		}
		f.close();
		String str = "Hello my name is piyush joshi";
		byte[] b2 = str.getBytes();
		OutputStream f2 = new FileOutputStream("E:/newmade2.txt", true);
		f2.write(b2);
	}
}