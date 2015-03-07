import static java.lang.System.*;
class UnaryDemo
{
	public static void main(String[] args)
	{
		int i,j;
		i=0;
		j = (i++)++ + (i + i)  ;
		out.println(i);
		out.println(j);
	}
}