

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class AkashAndHisAssignment2 {
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int noOfQueries = Integer.parseInt(temp[1]);
		String inputString = br.readLine();
		String[] inputQuery;
		int aux[][] = new int[inputString.length() + 1][26];
		for (int i = 0; i < inputString.length(); i++) {
			int d = inputString.charAt(i) - 'a';
			for (int j = 0; j < 26; j++)
				aux[i + 1][j] = aux[i][j];
			aux[i + 1][d] = aux[i][d] + 1;
		}
		while (noOfQueries-- > 0) {
			inputQuery = br.readLine().split(" ");
			int L = Integer.parseInt(inputQuery[0]);
			int R = Integer.parseInt(inputQuery[1]);
			int K = Integer.parseInt(inputQuery[2]);
			if (K > (R - L + 1)) {
				pr.println("Out of range");
			} else {
				int HL[] = new int[26];
				for (int j = 0; j < 26; j++)
					HL[j] = aux[R][j] - aux[L - 1][j];
				for (int j = 0; j < 26; j++) {
					K = K - HL[j];
					if (K <= 0) {
						pr.println((char) ('a' + j));
						break;
					}
				}
			}
		}
		pr.close();
	}

}
