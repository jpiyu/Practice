import static java.lang.System.*;

class PriorityDemo
{
	public static void main(String[] args)
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		int a = Thread.currentThread().getPriority();
		System.out.println(a);
	}
}