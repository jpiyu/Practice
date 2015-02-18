
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

class GeekoAndTree {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			BigInteger nodes = new BigDecimal(
					(((BigInteger.valueOf(k)).pow(n + 1))
							.subtract(new BigInteger("1"))).divide(BigInteger
							.valueOf(k - 1))).toBigInteger();

			System.out.println(nodes);
			// BigInteger rem =new BigInteger("0");
			// while(nodes.intValue()!=0)
			// {
			// rem=rem.add(nodes.mod(new BigInteger("10")));
			// nodes=nodes.divide(new BigInteger("10"));
			// }
			long rem = 0;
			String nodestring = nodes.toString();
			//System.out.println(nodestring);
			for (int i = 0; i < nodestring.length(); i++)
				rem += nodestring.charAt(i) - '0';
			System.out.println(rem);
			t--;
		}
	}
}
