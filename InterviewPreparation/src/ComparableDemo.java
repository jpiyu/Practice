
public class ComparableDemo {
	public static void main(String[] args)
	{
		String arr[] = new String[]{"1","2","3","4"};
		show(arr);
	}
	static void show(Comparable[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}
}
