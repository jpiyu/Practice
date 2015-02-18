import static java.lang.System.*;

import java.util.*;

class A {
	A() {
		System.out.println("inside A's constructor");
	}

	static {
		System.out.println("inside A's static block");
	}
	{
		System.out.println("inside A's initialization block");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("inside class A's finalize method");
	}
}

public class FinalizeDemo {
	public static void main(String[] args) {
		A a = new A();
		for(int i=0;i<10;i++)
		{
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println(i);
		}
		Runtime runtime = Runtime.getRuntime();
		runtime.runFinalization();
	}

}
