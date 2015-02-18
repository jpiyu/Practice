
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

//(SOD(1)+SOD(2)+SOD(3))%9=(1+2+3)%9=6 and (SOD(1+2+3))%9=SOD(6)%9=6. So, 6-6=0.
public class SumOfDigits {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		BigInteger digit = BigInteger.ZERO;
		BigInteger[] inputs = new BigInteger[N];
		for (int i = 0; i < N; i++) {
			line = br.readLine();
			digit = new BigInteger(line);
			inputs[i] = digit;
		}
		System.out.println(0);
	}

	private static BigInteger compute(BigInteger[] inputs) {
		BigInteger x = BigInteger.ZERO;
		BigInteger y = BigInteger.ZERO;
		for (int i = 0; i < inputs.length; i++) {
			x = x.add(getSOD(inputs[i]));
		}
		for (int i = 0; i < inputs.length; i++) {
			y = y.add(inputs[i]);
		}
		return x.subtract(y);
	}

	private static BigInteger getSOD(BigInteger num) {
		BigInteger sum = BigInteger.ZERO;
		while (num != BigInteger.ZERO) {
			sum = sum.add(num.remainder(BigInteger.TEN));
			num = num.divide(BigInteger.TEN);
		}
		return sum;
		// return inputs.intValue() % 9 == 0 && inputs.intValue() != 0) ? 9 :
		// inputs.intValue() % 9;
	}
}
