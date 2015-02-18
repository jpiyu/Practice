/** this is an example of creating a single stack even if we create several objects **/

import static java.lang.System.*;
import java.io.*;
class Stack2
{
	
	static int arr[] = new int[10];
	static int i;
	public void push(int a)
	{
		Stack2.arr[i] = a;
		Stack2.i++;

	}
	public int pop()
	{
		int num = Stack2.arr[i--];
		return num;
	}
	public void show()
	{
		for(int j=0;j<10;j++)
		{
			System.out.println(Stack2.arr[j]);
		}
	}
}
public class StackDemo {
	public static void main(String[] args) throws Exception
	{
		Stack2 stk = new Stack2();
		String more = "y";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the data item");
			int a = Integer.parseInt(br.readLine());
			stk.push(a);
			//System.out.println("do you want to enter more");
			//more = br.readLine();
		}//while(more == "y");
	
		stk.show();
		
		Stack2 stk2 = new Stack2();
		stk2.show();
	}

}
