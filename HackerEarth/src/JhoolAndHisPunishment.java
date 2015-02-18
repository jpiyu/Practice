

import java.io.*;
class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(br.readLine());
			String[] str=br.readLine().trim().split(" ");
			int b=Integer.parseInt(str[0]);
			int g=Integer.parseInt(str[1]);
			if(Math.abs(b-g)>1)
				System.out.println("Little Jhool wins!");
			else
				System.out.println("The teacher wins!");
		}
	}
}

