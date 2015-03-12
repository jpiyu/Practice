import java.io.*;
public class AppendingToAFile {
	public static void main(String[] args) throws Exception
	{
		File f = new File("file.txt");
		if(!f.exists())
		{
			f.createNewFile();
			System.out.println("file created");
		}
		FileWriter fw = new FileWriter(f,true);
		String str = "hello my name is piyush joshi\n";
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(str);
		bw.close();
		fw.close();
		System.out.println("done");
		
	}
}
