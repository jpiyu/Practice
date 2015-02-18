import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class LalitAndKundu {

	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int tc = Integer.parseInt(br.readLine());
			while (tc > 0) {
				tc--;

				String nubmerStr = br.readLine();
				String str[] = nubmerStr.split(" ");
				
		double ans = (double) (Long.parseLong(str[0]) - Long.parseLong(str[1]))
						/ (Long.parseLong(str[0]) + Long.parseLong(str[1]));
				DecimalFormat df = new DecimalFormat("0.000000000000");
				System.out.println(df.format(ans));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
