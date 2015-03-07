import static java.lang.System.*;
class GarbageCollectionDemo
{
	public static void main(String[] args)
	{
		int i = 10;
		System.out.println(i);
		System.gc();
		System.out.println(i);
		System.out.println("hello");
	}
}