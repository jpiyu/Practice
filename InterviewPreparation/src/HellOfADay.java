import java.io.*;
import java.util.*;
public class HellOfADay {
	public static void main(String[] args) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalMen = Integer.parseInt(br.readLine());
		String[] mixExperience = br.readLine().split(" ");
		ArrayList<Integer> bajirao = new ArrayList<Integer>();
		ArrayList<Integer> baba = new ArrayList<Integer>();
		for(int i=0;i<mixExperience.length;i++)
		{
			if(Integer.parseInt(mixExperience[i]) % 2 == 0)
			{
				bajirao.add(Integer.parseInt(mixExperience[i]));
			}
			else
			{
				baba.add(Integer.parseInt(mixExperience[i]));
			}
		}
		Collections.sort(baba,new Comparator<Integer>(){
			public int compare(Integer num1,Integer num2)
			{
				return num2.compareTo(num1);
			}
		});
		Collections.sort(bajirao,new Comparator<Integer>() {
			public int compare(Integer num1,Integer num2)
			{
				return num1.compareTo(num2);
			}
		});
		Iterator iter1 = bajirao.iterator();
		Iterator iter2 = baba.iterator();
		while(iter1.hasNext())
		{
			System.out.print(iter1.next() + " ");
		}
		System.out.println();
		while(iter2.hasNext())
		{
			System.out.print(iter2.next() + " ");
		}
	}
}
