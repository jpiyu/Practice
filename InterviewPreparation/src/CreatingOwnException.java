
class MyException extends Exception {
	
	MyException(String str)
	{
		super(str);
	}

}

public class CreatingOwnException
{
	public static void main(String[] args)
	{
		try
		{
			throw new MyException("my name is piyush joshi");
		}catch(Exception e)
		{
			//System.out.println("ehlllo");
			e.printStackTrace();
		}
	}
}