import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SettingPreviligesOnAFile {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name of the file");
		String name = br.readLine();
		File f = new File(name);
		if(f.exists())
		{
			System.out.println("file already exists");
			System.out.println("checking if the file is executable " + f.canExecute());
			System.out.println("checking if the file is readable " + f.canRead());
			System.out.println("checking if the file is writable " + f.canWrite());
			
		}
		else
		{
			f.createNewFile();
			System.out.println("setting the file previliges");
			System.out.println("setting the file to be executable " + f.setExecutable(true));
			System.out.println("setting the file to be readable " + f.setReadable(true));
			System.out.println("setting the file to be writable " + f.setWritable(true));
		}
	}
}
