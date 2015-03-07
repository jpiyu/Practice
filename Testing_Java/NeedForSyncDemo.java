// A LITTLE COMPLEX EXAMPLE ,, JUST CONSTRUCTOR OVERLOADING AND SOME HERA PHERI //

import static java.lang.System.*;
class Threading implements Runnable
{
	Thread t;
	static int count;
	Threading td;
	Threading()
	{
		t = new Thread();
		t.start();
	}
	Threading(Threading td)
	{
		this.td = td;
		t = new Thread(td);
		t.start();
	}
	synchronized public void run()
	{
		for(int i = 0 ; i < 5 ; i ++)
		{
			count++;
		}
		System.out.println(count);
	}
}
public class NeedForSyncDemo
{
	public static void main(String[] args)
	{
		System.out.println("entered main()");
		Threading t = new Threading();
		Threading t1 = new Threading(t);
		Threading t2 = new Threading(t);
	}
}