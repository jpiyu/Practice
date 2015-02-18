

import java.io.*;
//import java.util.Arrays;

class OnceUponATime {

	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br=new BufferedReader(new FileReader("OnceUponAtimeInTimeLand.txt"));
		String str=br.readLine();
		int NumofTestCases=Integer.parseInt(str);
		for(int i=0;i<NumofTestCases;i++)
		{
			str=br.readLine();
			String strComponents[]=str.split(" ");
			int N=Integer.parseInt(strComponents[0]);
			int K=Integer.parseInt(strComponents[1]);
			int Ai[]=new int[N];
			str=br.readLine();
			strComponents=str.split(" ");
			for(int j=0;j<N;j++)
			{
				Ai[j]=Integer.parseInt(strComponents[j]);
			}
			long maxHealth[] = new long[N];
			//System.out.println(Arrays.toString(maxHealth));
			for(int j=N-1;j>=N-K-1;j--)
				if(Ai[j]<0)
					maxHealth[j]=0;
				else
					maxHealth[j]=Ai[j];
			long maxafterK=maxHealth[N-1];
			//int minindex=N-2;
			for(int j=N-K-2;j>=0;j--)
			{
				maxafterK=Math.max(maxafterK,maxHealth[j+K+1]);
				maxHealth[j]=maxafterK+Ai[j];
				if(maxHealth[j]<0)
					maxHealth[j]=0;
			}
			long max=0;
			for(int j=0;j<N;j++)
				max=Math.max(maxHealth[j],max);
			System.out.println(max);
		}
		br.close();
	}
}
