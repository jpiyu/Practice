
public class InvokingNotepad {
	public static void main(String...strings) throws Exception
	{
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
	}
}
