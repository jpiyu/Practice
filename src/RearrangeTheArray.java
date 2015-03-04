import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class RearrangeTheArray {
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[]{0,1};
		a[0] = a[a[0]];
		a[1] = a[0];
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
}
