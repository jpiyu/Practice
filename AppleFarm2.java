import java.io.PrintWriter;
import java.io.*;

public class AppleFarm2 {
	public static void main(String[] args) throws IOException {
		InputReader reader = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = reader.readInt();
		int m = reader.readInt();
		long arr[][] = new long[n][m];
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				arr[i][j] = reader.readLong();
			}
		}
		long arr1[][] = new long[n + 1][m + 1];
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= m; j++) {
				long mx = Math.max(arr1[i - 1][j], arr1[i][j - 1]);
				mx += arr[i - 1][j - 1];
				arr1[i][j] = mx;
			}
		}
		out.println(arr1[n][m]);
		out.close();
	}

	static final class InputReader {
		private final InputStream stream;
		private final byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		private int read() throws IOException {
			if (curChar >= numChars) {
				curChar = 0;
				numChars = stream.read(buf);
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}

		public final int readInt() throws IOException {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			boolean negative = false;
			if (c == '-') {
				negative = true;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return negative ? -res : res;
		}

		public final long readLong() throws IOException {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			boolean negative = false;
			if (c == '-') {
				negative = true;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return negative ? -res : res;
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	}
}
