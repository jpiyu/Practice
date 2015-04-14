/* IMPORTANT: class must not be public. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HackerEarth_BattleOfWords {
    public static void main(String args[]) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			t--;
			String a = br.readLine().trim();
			int aa[][] = new int[26][2];
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == ' ')
					continue;
				aa[(int) a.charAt(i) - 97][0]++;
			}
			String b = br.readLine().trim();
			for (int i = 0; i < b.length(); i++) {
				if (b.charAt(i) == ' ')
					continue;
				aa[(int) b.charAt(i) - 97][1]++;
			}
			for (int i = 0; i < 26; i++) {
				if (aa[i][0] < aa[i][1]) {
					aa[i][1] = aa[i][1] - aa[i][0];
					aa[i][0] = 0;
				} else if (aa[i][0] > aa[i][1]) {
					aa[i][0] = aa[i][0] - aa[i][1];
					aa[i][1] = 0;
				} else
					aa[i][0] = aa[i][1] = 0;
			}
			int geta = create(aa, 0);
			int getb = create(aa, 1);
			if (geta > 0 && getb == 0)
				sb.append("You win some.\n");
			else if (getb > 0 && geta == 0)
				sb.append("You lose some.\n");
			else
				sb.append("You draw some.\n");

		}
		System.out.print(sb.toString());
	}

	public static int create(int ar[][], int ip) {
		int ans = 0;
		for (int i = 0; i < 26; i++)
			ans += ar[i][ip];
		return ans;
	}
}
