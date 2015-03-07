import java.lang.System.*;

class Hello {
	String str ;

	Hello(String s)
	{
		str = s;
	}
	void show() {
		System.out.println (str.lastIndexOf('u'));
		System.out.println (str.indexOf('u'));
	}
}

class P {
	public static void main(String[] args)
	{
		Hello a = new Hello("piyush");

		a.show();
	}
	}

