import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
// Stock Maximize
public class StocksMaximize {
 
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
         
        for (int t = 0; t < n; t++) {
            int numStock = sc.nextInt();
            int[] stocks = new int[numStock];
            for (int i = 0; i < numStock; ++i) {
                stocks[i] = sc.nextInt();
            }
             
            int[] maxSoFar = new int[numStock];
            int max = Integer.MIN_VALUE;
            for (int i = numStock-1; i >= 0; --i) {
                max = Math.max(max, stocks[i]);
                maxSoFar[i] = max;
            }
             
            long sum = 0;
            for (int i = 0; i < numStock; i++) {
                if (maxSoFar[i] != stocks[i]){
                    sum += maxSoFar[i] - stocks[i];
                }
            }
             
            System.out.println(sum);
        }
    }
}