

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

class GoldMine2{
	 static  StringTokenizer st;
	 static int q;
	 static StringBuilder sb;
	    public static void main(String[] args)  {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    Scanner sc= new Scanner(System.in);
	    try
	    {
	    	st = new StringTokenizer(br.readLine());
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    	int n = Integer.parseInt(st.nextToken());
	    	int m = Integer.parseInt(st.nextToken());
	    	int[][] array = new int[n][m];
	    	for(int i=0 ; i < n ;++i)
	    	{
	    		try
	    		{
	    			st = new StringTokenizer(br.readLine());
	    			for(int j = 0 ; j <m;++j)array[i][j]=Integer.parseInt(st.nextToken());
	    		}catch(Exception e)
	    		{
	    			e.printStackTrace();
	    		}
	    	}
	    	try
	    	{
	    	q = Integer.parseInt(br.readLine());
	    	sb = new StringBuilder("");
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	while(q-->0)
	    	{
	    		long sum =0;
	    		try
	    		{
	    		st = new StringTokenizer(br.readLine());
	    		}catch(Exception e)
	    		{
	    			e.printStackTrace();
	    		}
	    		int x1 = Integer.parseInt(st.nextToken());
	    		int y1 = Integer.parseInt(st.nextToken()),x2=Integer.parseInt(st.nextToken())
	    		,y2=Integer.parseInt(st.nextToken());
	    		for(int i =x1-1;i<=x2-1;++i)
	    		{
	    			for(int j =y1-1;j<=y2-1;++j)
	    			{
	    				sum +=array[i][j];
	    			}
	    		}
	    		sb.append(sum).append("\n");
	    		
	    		
	    	}
	    	System.out.print(sb);
	    	
	}
	      
	  
 }
