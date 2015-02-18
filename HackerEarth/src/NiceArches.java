
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class NiceArches {
	public static void main(String args[]) throws NumberFormatException,
			IOException {
		int t, i = 0, j = 0, len, count = 0;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> st = new Stack<Character>();
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new Stack<Character>();
			i = 0;
			j = 0;
			s = br.readLine();
			len = s.length();
			for (i = 0; i < len; i++) {
				st.push(s.charAt(i));
			}
			i = len - 1;
			j = len - 2;
			while (j >= 0) {
				// System.out.println(i);
				// System.out.println(j);
				if (st.get(i) != st.get(j)) {
					i--;
					j--;
				} else {
					// System.out.println(i+" "+st.size());
					if (i + 1 <= st.size() - 1) {
						st.remove(i);
						st.remove(j);
						i = i - 1;
						j = j - 1;
					} else {
						st.remove(i);
						st.remove(j);
						i = j - 1;
						j = j - 2;
					}
				}
			}
			if (st.isEmpty()) {
				count++;
				// System.out.println("yes");
			}
		}
		System.out.println(count);
	}

}
