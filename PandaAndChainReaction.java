import java.util.*;
import java.io.*;

class test {

	

	public static void main(String args[]) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int test = Integer.parseInt(br.readLine());
		int MOD = 1000000 + 3;
		
		int ans[] = new int[MOD+1];
		long t = 1;
		for(int i=1;i<MOD;++i) {
			t = (long)i*(long)t;
			t %= MOD;
			
			ans[i] = (int)t;
		}
		
		while(test-->0) {
		
			String s[] = br.readLine().split(" ");
			
			long n = Long.parseLong(s[0]);
			long x = Long.parseLong(s[1]);
		
			
		
			if(n>=MOD) {
				System.out.println("0");
				continue;			
			}
			
			if(n==0) {
			
				System.out.println(x);
				continue;
			}
			
			//System.out.println(ans[(int)n] + " " + x);
			
			long ans1 = (long)x*(long)ans[(int)n];
			ans1 %= MOD;
			System.out.println(ans1);
			
		}
	
	}


}