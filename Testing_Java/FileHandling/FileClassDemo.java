import static java.lang.System.*;
import java.io.*;
class FileClassDemo
{
	static void printOut(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		File f1 = new File("../../dir.html");
		printOut("File-Name : " + f1.getName());
		printOut("File-Path : " + f1.getPath());
		printOut("File-AbsolutePath :" + f1.getAbsolutePath());
		File f2 = new File("E:/Testing");
		if(f2.isFile())
			out.println("f2 is a file");
		else
			out.println("f2 is a directory");
		printOut("File Size : " + f1.length());
		printOut("Directory Size : " + f2.length());        //the size of the folder can also be found by this method //
		File f3 = new File("piyush.txt");
		boolean done1 = f1.renameTo(f3);
		out.println(done1);
		File f4 = new File("joshi");
		boolean done2 = f2.renameTo(f4);
		out.println(done2);
	}
}

