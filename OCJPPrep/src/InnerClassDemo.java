class Outer
{
	class Inner
	{
		public void hello()
		{
			System.out.println("hello my name is piyush joshi");
		}
	}
	public static Outer.Inner makeObject()
	{
		Outer.Inner in = new Outer().new Inner();
		return in;
	}
}
class InnerClassDemo
{
	public static void main(String[] args)
	{
		Outer.Inner inner = new Outer().new Inner();
		inner.hello();
		Outer.Inner in = Outer.makeObject();
		in.hello();
	}
}