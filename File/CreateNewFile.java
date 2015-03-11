import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CreateNewFile {
	public static void main(String[] args) throws IOException
	{
		File file = new File("hello.text");
		boolean isSuccessful = file.createNewFile();
		if(isSuccessful)
		{
			System.out.println("file is created successfully");
			
		}
		else
		{
			System.out.println("file cannot be created");
		}
	}
}
