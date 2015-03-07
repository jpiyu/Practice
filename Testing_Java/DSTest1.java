import static java.lang.System.*;

class Alpha
{
	int data;

	public void putData(int a)
	{
		data = a;
	}
	public int getData()
	{
		return data;
	}
}

class DSTest1
{
	public static void main(String[] args)
	{
		Alpha a = new Alpha();

		a.putData(10);

		int x = a.getData();

		out.println("data : "+x);
	}
}


