import static java.lang.System.*;
import java.io.*;
public class ConsoleDemo 
{
	public static void main(String[] args)
	{
		String str;
		Console con;
		
		con = System.console();
		if (con == null)
		{
			return ;
		}
		else
			str = con.readLine();
		con.printf ("here is the string you entered" + str);
	}

}
