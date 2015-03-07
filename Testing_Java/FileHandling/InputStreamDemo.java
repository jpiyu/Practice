import static java.lang.System.*;
import java.io.*;
class InputStreamDemo
{
	public static void main(String[] args)throws Exception
	{
		InputStream is = new FileInputStream("E:/Testing/linking.html");
		int size = is.available();
		for(int i=0; i<size; i++)
		{
			char c = (char)is.read();
			out.print(c);
		}
	}
}
