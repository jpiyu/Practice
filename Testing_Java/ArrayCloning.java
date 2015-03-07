//THE CLONE METHOD IS A MEMBER OF THE OBJECT CLASS //

import static java.lang.System.*;
public class ArrayCloning
{
	public static void main(String[] args)
	{
		int[] a = new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i] = i;
		}
		int[] b = (int[])a.clone();
		for(int i=0; i<b.length; i++)
		System.out.println(b[i]);
	}
}