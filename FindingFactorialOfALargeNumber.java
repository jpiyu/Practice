import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class FindingFactorialOfALargeNumber {
	public static final int MAXLENGTH = 100;
	static int elements = 0;
	static int[] factorialArray;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		char[] c = br.readLine().toCharArray();
		int []arr = new int[c.length];
		factorialArray = new int[MAXLENGTH];
		int number = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(c[c.length-1-i] - '0');
			number = number + arr[i]*(int)Math.pow(10, arr.length-1-i);
		}
		//System.out.println(number);
		elements = arr.length;
		multiply(arr,factorialArray,3);
		for(int i=0;i<elements;i++)
		{
			System.out.print(factorialArray[elements-1-i]);
		}
		
		
	}
	static void multiply(int[] arr,int[] factorialArray,int number)
	{
		int i=0,carry=0,product=0;
		for(i=0;i<arr.length;i++)
		{
			product = arr[i]*number + carry;
			factorialArray[i] = product%10;
			carry = product/10;
			elements = i;
		}
		while(carry != 0)
		{
			factorialArray[i++] = carry%10;
			carry /= 10;
			elements = i;
		}
	}
}
