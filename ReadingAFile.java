import java.io.*;
import java.util.*;
public class ReadingAFile {
	public static void main(String[] args) throws Exception
	{
		File f = new File("KnowingOSName.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		while(dis.readLine() != null)
		{
			System.out.println(dis.readLine());
		}
		dis.close();
		bis.close();
		fis.close();
	}
}
