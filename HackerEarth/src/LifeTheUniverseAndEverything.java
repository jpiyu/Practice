
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;

class LifeTheUniverseAndEverything {
	public static void main(String args[]) throws Exception {
		// BufferedReader br = new BufferedReader(new FileReader ("P1.in"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			// String line = br.readLine();
			int N = Integer.parseInt(line);
			if (N == 42)
				return;
			else
				System.out.println(N);
		}
	}
}
