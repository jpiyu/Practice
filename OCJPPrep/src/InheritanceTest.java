class A {
	public void hello() {
		System.out.println("inside method A");
	}
}
class B extends A {
	/*public void hello()
	{
		System.out.println("inside method B");
	}*/
	public void hi(){
		System.out.println("inside method hii");
	}
}

public class InheritanceTest {
	public static void main(String[] args)
	{
		A b = new B();
		b.hello();  // b.hi() won't work //
	}
}
