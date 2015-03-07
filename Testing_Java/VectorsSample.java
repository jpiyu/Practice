import static java.lang.System.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.*;
public class VectorsSample   {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		while(s.hasNext())
		{
			String str = s.next();
			v.add(str);
			System.out.println(str);
		}
		
		
	}

}
