

/* IMPORTANT: class must not be public. */


//* uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class NextLucky3 {
	public static void main(String args[] ) throws Exception {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		//String ans=" ";
		int T = Integer.parseInt(line);
		while(T-->0)
		{
			int num = Integer.parseInt(br.readLine());
			int[] arr = convertIntoIntegerArray(num);
			/*for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}*/
			int[] arr2 = new int[arr.length+1];
			if(arr.length == 1)
			{
				if(arr[0] < 3)
				{
					arr2[1] = 3;
					arr2[0] = 0;
				}
				else if(arr[0] >= 3 && arr[0] < 5)
				{
					arr2[1] = 5;
					arr2[0] = 0;
				}
				else 
				{
					arr2[1] = 3;
					arr2[0] = 3;
				}
			}
			else
			{
				for(int j=arr.length-1;j>=1;j--)
				{
					if(arr[j] < 3)
					{
						//System.out.println("here1");
						arr2[j+1] = 3;
					}
					else if(3 <= arr[j] && arr[j] < 5)
					{
						//System.out.println("here2");
						arr2[j+1] = 5;
					}
					else 
					{
						//System.out.println("here3");
						arr2[j+1] = 3;
					}
				}



				if(arr[1] >= 5 && arr[0] >= 5)
				{
					//System.out.println("here 7");
					arr2[1] = 3;
					arr2[0] = 3;
				}
				else
				{
					if(arr[1] >= 5 && arr[0] <= 3)
					{
						//System.out.println("here 8");
						arr2[1] = 5;
						arr2[0] = 0;
					}
					else
					{
						if(arr[0] <= 3)
						{
							//System.out.println("here4");
							arr2[1] = 3;
							arr2[0] = 0;
						}
						else if(3 < arr[0] && arr[0] <= 5)
						{
							//System.out.println("here5");
							arr2[1] = 5;
							arr2[0] = 0;
						}
						else if(arr[0] > 5)
						{
							//System.out.println("here6");
							arr2[1] = 3;
							arr2[0] = 0;
						}
					}
				}
			}
			/*for(int i=0;i<arr2.length;i++)
			{
				System.out.println(arr2[i]);
			}*/
			
			String answer = "";
			for(int i=0;i<arr2.length;i++)
			{
				answer = answer + arr2[i];
			}
			System.out.println(Integer.parseInt(answer));
		}
	}
	static int[] convertIntoIntegerArray(int num)
	{
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		while(num > 0)
		{
			int digit = num % 10;
			list2.add(digit);
			num = num/10;
		}
		int array[] = new int[list2.size()];
		for(int u=0;u<list2.size();u++)
		{
			array[u] = list2.get(list2.size()-1-u);
		}
		list2.clear();
		return array;
	}
}
