import static java.lang.System.*;
class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] a = new int[5];
		for(int i =0 ;i<a.length ; i++)
		{
			a[i] = i;
		}
		for(int i=0;i<a.length ; i++)
		{
			out.println(a[i]);
		}
		int[] b = new int[5];
		arraycopy(a,0,b,0,a.length);         // THIS IS THE METHOD OF THE "SYSTEM" CLASS //
		for(int i = 0 ; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}