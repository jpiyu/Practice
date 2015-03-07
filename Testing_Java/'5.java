class Table 
{
	void printTable (int n)
	{
		for (int i = 0 ; i <= 10 ; i++)
		{
			System.out.println(i * n);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class main implements Runnable 
{
	Table t;
	main(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
}

class ThreadTest10
{
	public static void main(String[] args)
	{
		Table obj = new Table();
		main m = new main(obj);
		m.start();
	}
}