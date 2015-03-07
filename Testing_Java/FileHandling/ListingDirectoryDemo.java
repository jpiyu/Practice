import static java.lang.System.*;
import java.io.*;
class ListingDirectoryDemo
{
	public static void main(String[] args)
	{
		File f1 = new File("F:/");
		FilenameFilter f = new Filter("jpg");
		String[] list = f1.list(f);
		for(int i=0; i<list.length; i++)
		{
			out.println(list[i]);
		}
	}
}
class Filter implements FilenameFilter
{
	String str;
	Filter(String str)
	{
		this.str = "." + str;
	}
	public boolean accept(File dir, String name)
	{
		return name.endsWith(str);
	}
}