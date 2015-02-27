package Greedy;
import static java.lang.System.*;

import java.io.*;
import java.util.*;
class Job implements Comparable
{
	String batch;
	int deadLine;
	int profit;
	Job(String batch,int deadLine,int profit)
	{
		this.batch = batch;
		this.deadLine = deadLine;
		this.profit = profit;
	}
	@Override
	public int compareTo(Object o) 
	{
		Job j = (Job)o;
		if(profit > j.profit)
		{
			return -1;
		}
		else if(profit < j.profit)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
public class JobSequencing {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter the number of jobs");
		int totalJobs = Integer.parseInt(br.readLine());
		Job[] jobsArray = new Job[totalJobs];
		int i=0;
		while(i < totalJobs)
		{
			System.out.println("enter batch name for job no : " + i);
			String c = br.readLine();
			System.out.println("enter the deadline for job no : " + i);
			int dl = Integer.parseInt(br.readLine());
			System.out.println("enter the profit for job no : " + i);
			int pft = Integer.parseInt(br.readLine());
			jobsArray[i] = new Job(c,dl,pft);
			i++;
		}
		Arrays.sort(jobsArray);
		for(int k=0;k<totalJobs;k++)
		{
			System.out.println(jobsArray[k].batch);
		}
	}
}
