import static java.lang.System.*;
enum Dance {SALSA, LOCKING , BREAKDANCE};
class EnumDemo
{
	static Dance d;
	public static void main(String[] args)
	{
		d = Dance.SALSA;
		out.println(d);
	}
}