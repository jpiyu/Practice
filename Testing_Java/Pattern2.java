import static java.lang.System.*;
class Pattern2
{
	public static void main(String[] args)
	{
		for(int j=0; j<5; j++)
		{
		for(int i=j; i<5; i++)
		{
			System.out.print(" " + '*' + " " );
		}
		System.out.println();
		}
	}
}