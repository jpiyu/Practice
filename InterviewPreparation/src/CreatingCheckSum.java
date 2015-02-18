import static java.lang.System.*;

import java.io.*;
import java.util.*;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
public class CreatingCheckSum {
	public static void main(String[] args) throws Exception
	{
		String sentence = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sentence = br.readLine();
		byte[] byteArray = sentence.getBytes();
		Checksum checkSum1 = new CRC32();
		Checksum checkSum2 = new Adler32();
		checkSum1.update(byteArray, 0, byteArray.length);
		checkSum2.update(byteArray, 0, byteArray.length);
		
		long checkSum1Value = checkSum1.getValue();
		long checkSum2Value = checkSum2.getValue();
		
		System.out.println("The value of first checksum is" + checkSum1Value + "\n" + "The value of the second checksum is" + checkSum2Value);
		
	}
}
