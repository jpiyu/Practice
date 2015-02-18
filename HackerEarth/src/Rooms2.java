/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.PriorityQueue;


class Rooms2 {
	static int max;
	static long[] gArr;
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		new Rooms2().solve(br);
		br.close();
	}
	void solve(BufferedReader br) throws Exception
	{
		int T=Integer.parseInt(br.readLine().trim());
		for(int i=0;i<T;i++)
		{
			int N=Integer.parseInt(br.readLine().trim());
			int[] a=new int[N];
			int[] d=new int[N];
			gArr=new long[N];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++)
			{
				a[j]=Integer.parseInt(st.nextToken());
			}
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++)
			{
				d[j]=Integer.parseInt(st.nextToken());
			}
			for(int j=0;j<N;j++)
			{
				gArr[j]=(long)a[j]<<16|(a[j]+d[j]);
				System.out.println(gArr[j]);
			}
			int count=1;
			PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
			Arrays.sort(gArr);
			//System.out.println(Arrays.toString(gArr));
			int ad=(int)(gArr[0]&0xFFFF);
			pq.offer(ad);
			for(int j=1;j<N;j++)
			{
				int t1=pq.peek();
				int t2=(int)((gArr[j]>>>16)&0xFFFF);
				ad=(int)(gArr[j]&0xFFFF);
				//System.out.println(t1);
				//System.out.println("- "+t2);
				//System.out.println("--"+ad);
				if(t2>=t1)
				{
					pq.poll();
					pq.offer(ad);
				}
				else
				{
					count++;
					pq.offer(ad);
				}
			}
			System.out.println(count);
		}
	}
}
