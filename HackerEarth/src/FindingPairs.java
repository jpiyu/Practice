
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
 */
import java.util.*;

class FindingPairs {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 * 
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String line = br.readLine(); int N =
		 * Integer.parseInt(line); for (int i = 0; i < N; i++) {
		 * System.out.println("hello world"); }
		 */
		Scanner ob = new Scanner(System.in);
		int test = ob.nextInt();
		while (test-- != 0) {
			int n = ob.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = ob.nextInt();
			}
			Arrays.sort(arr);
			int count = 1, m = arr[0], number = 1;
			for (int i = 1; i < n; i++) {
				if (arr[i] == m) {
					number++;
				} else {
					number = 1;
					m = arr[i];
				}
				count = count + number;
			}
			System.out.println(count);
		}
	}
}
