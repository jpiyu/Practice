import static java.lang.System.*;
public class SystemInRead {
	public static void main(String args[])
	{
		int ch = 0 ;
		try
		{
		ch = System.in.read();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(ch);
	}

}
