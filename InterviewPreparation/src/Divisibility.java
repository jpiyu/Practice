import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Divisibility {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ");
		int p = Integer.parseInt(firstLine[0]);
		int q = Integer.parseInt(firstLine[1]);
		int bigInteger = Integer.parseInt(br.readLine());
		int[][] elementArray = new int[q][2];
		for (int i = 0; i < q; i++) {
			String[] array = br.readLine().split(" ");
			for (int j = 0; j < 2; j++) {
				elementArray[i][j] = Integer.parseInt(array[j]);
			}
		}
		/*
		 * for(int i=0;i<q;i++) { for(int j=0;j<2;j++) {
		 * System.out.println(elementArray[i][j]); } }
		 */

	}
}

// an important concept is that while traversing a collection with the help of
// iterator we cannot modify the collection , this will result in an exception
// being thrown