import static java.lang.System.*;
public class EqualsDemo {
	public static void main(String[] args)
	{
		String str = new String("piyuush");
		String str2 = new String("piyuush");
		if(str == str2)
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
		if(str.equals(str2))
		{
			System.out.println("equals in this case");
		}
		
	}

}
