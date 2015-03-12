import java.io.*;
public class DeleteAFile {
	public static void main(String[] args) throws Exception
	{
		File f = new File("hello.txt");
		boolean create = f.createNewFile();
		if(create)
		{
		System.out.println("file created");
		}
		boolean delete = f.delete();
		System.out.println("file deleted");
	}
}
