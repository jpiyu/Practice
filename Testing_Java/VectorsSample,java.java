import static java.lang.System.*;
import java.util.Scanner;
import java.util.Vector;
public class VectorsSample   {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Vector v = new Vector();
		while(s.hasNext())
		{
			String str = s.next();
			v.add(str);
			System.out.println(str);
		}


	}

}
