import static java.lang.System.*;
import java.io.*;
class Stack3
{
	int size;
	int top,arr[];
	Stack3(int num){
		this.size = num;
		arr = new int[size];
		//int top = 0;
	}
	public void push(int num)
	{
		this.arr[top] = num;
		top++;
	}
	public int pop()
	{
		int num = this.arr[--top];
		return num;
	}
	public void insert() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int j=0;j<size;j++)
		{
			System.out.println("enter the element no" + j);
			this.push(Integer.parseInt(br.readLine()));
		}
	}
	public void show()
	{
		for(int i=0;i<top;i++)
		{
			System.out.println(this.arr[i]);
		}
	}
	
}
public class StacksWRTObjects {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("insert the size of the ");
		int size = Integer.parseInt(br.readLine());
		Stack3 stk = new Stack3(size);
		System.out.println("Stack has been created");
		stk.insert();
		stk.show();
		int num = stk.pop();
		System.out.println(num);
		stk.show();
	}

}
