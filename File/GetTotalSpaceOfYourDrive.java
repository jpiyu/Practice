import java.io.*;
public class GetTotalSpaceOfYourDrive {
	public static void main(String[] args)
	{
		File file = new File("c:");
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getUsableSpace());
	}
}
