import static java.lang.System.*;
import java.io.*;
class ReaderDemo
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("E:/Testing/HeapSort.java");
		BufferedReader br = new BufferedReader(fr);
		while (br.readLine() != null)
		{
			System.out.println(br.readLine());
		}
	}
}