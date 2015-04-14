/* IMPORTANT: class must not be public. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class NonFibo {
    static List<Long> fib;

	public static void main(String args[]) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		fib = new ArrayList<Long>();
		addFib();
		while (q > 0) {
			q--;
			long x = Long.parseLong(br.readLine());
			sb.append(getNonFib(x) + "\n");
		}
		System.out.print(sb.toString());
	}

	public static long getNonFib(long x) {
		int getInd = Collections.binarySearch(fib, x);
		long tmpx = x;
		if (getInd >= 0)
			getInd++;
		if (getInd < 0)
			getInd = -(getInd + 1);
		long nontmp = tmpx - getInd;
		//System.out.println("til.. " + nontmp);
		while (nontmp < x) {
			tmpx = tmpx+(x-nontmp);
			getInd = Collections.binarySearch(fib, tmpx);
			if (getInd >= 0)
				getInd++;
			if (getInd < 0)
				getInd = -(getInd + 1);
			nontmp = tmpx - getInd;
			//System.out.println(tmpx + " " + getInd + " " + nontmp);
		}
		return tmpx;
	}

	public static void addFib() {
		fib.add(1l);
		long f = 1;
		long s = 1;
		long l = 0;
		while (l <= 100000000000000000l) {
			l = f + s;
			fib.add(l);
			f = s;
			s = l;
		}
	}
}
