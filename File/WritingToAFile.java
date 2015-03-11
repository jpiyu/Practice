import java.io.*;
public class WritingToAFile {
	public static void main(String[] args) throws Exception
	{
		File f = new File("myfile.txt");
		if(!f.exists())
		{
			f.createNewFile();
			f.setWritable(true);
		}
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "hello my name is piyush";
		byte[] b = str.getBytes();
		bos.write(b);
		bos.close();
		fos.close();
		System.out.println("done");
	}
}
