import static java.lang.System.*;
class ArrayElementSearch
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		System.out.println("the index of 2 is :" + search(a ,2));
	}
	static int search(int[] a , int b)
	{
		int c = 0;
		for(int i=0; i< a.length; i++)
		{
			if(a[i] == b)
			c = i;
		}
		return c;
	}
}