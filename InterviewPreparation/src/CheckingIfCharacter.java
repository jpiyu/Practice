import static java.lang.System.*;

import java.io.*;
public class CheckingIfCharacter {
	public static void main(String []arg) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char arg0 = 'c';
		boolean check = Character.isLetter(arg0);
		System.out.println(check);
		
	}
}
