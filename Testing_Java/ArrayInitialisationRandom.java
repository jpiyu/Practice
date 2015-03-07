import static java.lang.System.*;
import java.util.Random;
class ArrayInitialisationRandom
{
	private static Random random = new Random();         // WE WILL HAVE TO DECLARE THE OBJECT OF THE RANDOM CLASS "STATIC" OTHERWISE //

	public static void main(String[] args)
	{
		int[] array = new int[5];
		for(int i =0; i<array.length; i++)
		{
			array[i] = assignElement(1000);
		}
		for(int i=0; i<array.length; i++)
		{
			out.println(array[i]);
		}
	}
	public static int assignElement(int range)
	{
		int a;
		a = random.nextInt(range);
		return a;
	}
}