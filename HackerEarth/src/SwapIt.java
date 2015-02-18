import java.io.*;
import java.util.*;

public class SwapIt {
	private static int readInt(BufferedReader in) throws IOException {
		return Integer.parseInt(in.readLine());
	}
	private static int[] readInts(BufferedReader in, int n) throws IOException {
		int[] res = new int[n];
		StringTokenizer st = new StringTokenizer(in.readLine());
		for (int i = 0; i < n; i++) res[i] = Integer.parseInt(st.nextToken());
		return res;
	}
	private static int min(int[] A, int l, int h) {
		if (l > h) return -1;
		int min = A[l], minp = l;
		for (int i = l+1; i <= h; i++) {
			if (A[i] < min) {
				min = A[i]; minp = i;
			}
		}
		return minp;
	}
	private static void shift(int[] A, int l, int h) {
		int t = A[h];
		for (int i = h; i > l; i--) A[i] = A[i-1];
		A[l] = t;
	}
	private static void solve(int N, int[] A, int K) {
		int i = 0;
		while (K > 0) {
			int p = min(A, i, Math.min(N-1, i+K));
			if (p < 0) break;
			shift(A, i, p);
			K -= p-i;
			i++;
		}
	}
	public static void main(String args[] ) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int T = readInt(in);
		while (T-- > 0) {
			int[] p = readInts(in, 2);
			int N = p[0], K = p[1];
			int[] A = readInts(in, N);
			solve(N, A, K);
			out.print(A[0]);
			for (int i = 1; i < A.length; i++) out.print(" "+A[i]);
			out.println();
		}
		out.flush();
	}
}

