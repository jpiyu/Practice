import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class CalculatingCombinations {

       BufferedReader reader;
       StringTokenizer tokenizer;
       PrintWriter out;

       public void solve() throws IOException {
              int T = nextInt();
              for (int count = 0; count < T; count++) {
                     int N = nextInt();

                     BigInteger nCk = BigInteger.ONE;
                     int i=N;
                           for (int j = 0; j <= N; j++) {
                                  System.out.print(nCk.mod(new BigInteger("1000000000")) + " ");
                                  nCk = nCk.multiply(new BigInteger((i - j)+"")).divide(new BigInteger(((j + 1))+""));
                           }
                           System.out.println();
                    
              }

       }

       /**
        * @param args
        */
       public static void main(String[] args) {
              new CalculatingCombinations().run();
       }

       public void run() {
              try {
                     reader = new BufferedReader(new InputStreamReader(System.in));
                     tokenizer = null;
                     out = new PrintWriter(System.out);
                     solve();
                     reader.close();
                     out.close();
              } catch (Exception e) {
                     e.printStackTrace();
                     System.exit(1);
              }
       }

       int nextInt() throws IOException {
              return Integer.parseInt(nextToken());
       }

       long nextLong() throws IOException {
              return Long.parseLong(nextToken());
       }

       double nextDouble() throws IOException {
              return Double.parseDouble(nextToken());
       }

       String nextToken() throws IOException {
              while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                     tokenizer = new StringTokenizer(reader.readLine());
              }
              return tokenizer.nextToken();
       }
}
