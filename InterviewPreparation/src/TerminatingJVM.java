import static java.lang.System.*;

public class TerminatingJVM {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("hello.... starting program");
		runtime.halt(1);
		System.out.println("java virtual machine terminated");
	}
}
