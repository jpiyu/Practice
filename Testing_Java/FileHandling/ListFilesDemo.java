import static java.lang.System.*;
import java.io.*;
class ListFilesDemo
{
	public static void main(String[] args)
	{
		File f = new File("E:/");
		File[] f2 = f.listFiles();
		for(int i=0; i<f2.length; i++)
		{
			if(f2[i].isFile())
			{
				out.println(f2[i] + "is a File");
			}
			else
			{
				out.println(f2[i] + "is a Directory");
			}
		}
	}
}