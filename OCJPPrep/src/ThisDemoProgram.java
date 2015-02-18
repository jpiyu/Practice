import static java.lang.System.*;
class ThisDemo {
	int x;
	ThisDemo(int x)
	{
		this.x = x;
	}
	public void print()
	{
		System.out.println(this.x);
	}
	public void hii()
	{
		print(this);
	}
	public void print(ThisDemo td)
	{
		System.out.println(td.x);
	}
}
class ThisDemoProgram
{
	public static void main(String[] args)
	{
		ThisDemo td = new ThisDemo(5);
		td.hii();
	}
}