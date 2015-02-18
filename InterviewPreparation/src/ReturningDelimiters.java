import java.util.StringTokenizer;

public class ReturningDelimiters {
	public static void main(String[] args) {
		String str = "my*name*is*piyush*joshi";
		StringTokenizer stk = new StringTokenizer(str, "*", false); // here the
																	// third
																	// parameter
																	// which is
																	// boolean
																	// tells
																	// whether
																	// to print
																	// the
																	// delimiter
																	// or not //
		while (stk.hasMoreElements()) {
			System.out.println(stk.nextToken("*"));
		}
	}
}
