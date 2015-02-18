
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
 */
import java.io.*;


class MindPlaces {
	static String s;
	static String[] c;
	static int q,n,m;
	public static void main(String[] args) throws IOException,
			InterruptedException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		s = br.readLine();
		c = s.split(" ");
		
		n = Integer.parseInt(c[0]);
		m = Integer.parseInt(c[1]);
		int mem[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			c = s.split(" ");
			for (int j = 0; j < m; j++) {
				mem[i][j] = Integer.parseInt(c[j]);
			}
		}
		q = Integer.parseInt(br.readLine());
		int search[] = new int[q];
		int o[] = new int[q];
		int o1[] = new int[q];
		for (int i = 0; i < q; i++) {
			search[i] = Integer.parseInt(br.readLine());
			o[i] = -1;
			o1[i] = -1;
		}
		// input done
		for (int i = 0; i < q; i++) {
			a: for (int k = 0; k < n; k++) {
				for (int j = 0; j < m; j++) {
					if (search[i] == mem[k][j]) {
						o[i] = k;
						o1[i] = j;
						break a;
					}
				}
			}
			System.out.println(o[i] + " " + o1[i]);
		}
	}
}
