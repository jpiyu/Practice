class Super {
	String c = "piyush";
}
class Sub extends Super{
	String c = "joshi";
}
class Super2 {
	public static void main(String[] args)
	{
		Sub s = new Super();
		System.out.println(s.c);
		Sub s2 = new Sub();
		System.out.println(s2.c);
	}
}