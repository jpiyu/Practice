import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map.Entry;


public class BabaiAndDiti { 
	static int[] array;
	static String[] str;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			int size = Integer.parseInt(br.readLine());
			array = new int[size];
			str = br.readLine().split(" ");
			for(int i=0;i<array.length;i++)
			{
				array[i] = Integer.parseInt(str[i]);
			}
			int length = 1;
			for(int i=0;i<array.length;i++)
			{
				for(int j=i+1;j<array.length;j++)
				{
					if(array[i] == array[j] && j-i >= length)
					{
						length = j-i+1;
						//System.out.println(length);
					}
				}
			}
			System.out.println(length);
			testCases--;
		}
	}
}
