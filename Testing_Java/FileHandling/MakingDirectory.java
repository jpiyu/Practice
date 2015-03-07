import static java.lang.System.*;
import java.io.*;
public class MakingDirectory
{
	public static void main(String[] args)
	{
		File f = new File("E:/");
		f.mkdir();
		File f2 = new File("piyush");
		f.renameTo(f2);
	}
}
