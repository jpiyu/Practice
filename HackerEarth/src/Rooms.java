import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class Rooms {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine().trim());
		while(testCases > 0)
		{
			int no_of_guests =Integer.parseInt(br.readLine().trim());
			int[] arrivalArray = new int[no_of_guests];
			int[] stayDurationArray = new int[no_of_guests];
			StringTokenizer st1=new StringTokenizer(br.readLine());
			for(int j=0;j<no_of_guests;j++)
			{
			arrivalArray[j]=Integer.parseInt(st1.nextToken());
			}
			StringTokenizer st2=new StringTokenizer(br.readLine());
			for(int j=0;j<no_of_guests;j++)
			{
			stayDurationArray[j]=Integer.parseInt(st2.nextToken());
			}
			int[] leavingTimeArray = new int[no_of_guests];
			for(int i=0;i<no_of_guests;i++)
			{
				leavingTimeArray[i] = arrivalArray[i] + stayDurationArray[i];
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			/*for(int i=0;i<no_of_guests;i++)
			{
				System.out.println(arrivalArray[i] + "---------" + stayDurationArray[i]);
			}*/
			list.add(leavingTimeArray[0]);
			for(int i=1;i<no_of_guests;i++)
			{
				//System.out.println(list.size());
				for(int j=0;j<list.size();j++)
				{
					//System.out.println("here 1");
					if(arrivalArray[i] >= list.get(j))
					{
						//System.out.println("here 2");
						list.remove(j);
						list.add(leavingTimeArray[i]);
						//System.out.println(list);
						break;
					}
					else
					{
						//System.out.println("here3");
						//System.out.println(list);

						list.add(leavingTimeArray[i]);
						//System.out.println("list ====" + list);
						break;
						//rooms++;
					}
				}
			}
			System.out.println(list.size());
			list.clear();
			testCases--;
		}
	}
}
