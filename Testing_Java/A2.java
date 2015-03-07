class A2
{
	public static void main(String[] args)
	{
		int i =0;
		test(i);
		System.out.println(i);
	}
	static int test(int i)
	{
		i = i++;
		return i;
	}
}