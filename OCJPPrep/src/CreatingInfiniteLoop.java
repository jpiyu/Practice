
public class CreatingInfiniteLoop {
	public static void main(String[] args)
	{
		int i=0;
		while(i<1)
		{
			System.out.println("hello");
			continue;
			//i++;
		}
	}
}
