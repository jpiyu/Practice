import java.io.*;
import java.net.*;
class DesignPatternDemo
{
	public static void main(String[] args) throws Exception
	{
		int ch;
		URL obj = new URL("http://www.worldfree4u.com");
		URLConnection conn = obj.openConnection();
		InputStream in = conn.getInputStream();
		while((ch = in.read()) != -1)
		{
			//ch = in.read();
			System.out.print((char)ch);
		}
	}
}