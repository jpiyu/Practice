import static java.lang.System.*;
class FindingAddressOfObjectDemo
{
	public static void main(String[] args)
	{
		FindingAddressOfObjectDemo fd = new FindingAddressOfObjectDemo();
		System.out.println(fd);
		FindingAddressOfObjectDemo fd2 = new FindingAddressOfObjectDemo();
		System.out.println(fd2);
	}
}