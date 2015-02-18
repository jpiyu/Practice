import java.io.*;
public class PalindromicNumbers {
	public static void main(String[] args) throws Exception
	{
		//System.out.println("started");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int y =0,numberOfElements=0;
		int [][]arr = new int[testCases][];
		//System.out.println("starting");
		while(y<testCases)
		{
			//System.out.println("inside initializer while");
			String[] str = br.readLine().split(" ");
			arr[y] = new int[2];
			for(int i=0;i<str.length;i++)
			{
				//System.out.println("inside initializer for");
				arr[y][i] = Integer.parseInt(str[i]);
			}
			y++;
		}
		y=0;
		while(y<testCases)
		{
			numberOfElements = 0;
			//System.out.println("inside checking while");
			for(int j=arr[y][0];j<=arr[y][1];j++)
			{
				//System.out.println("inside for");
				if(checkPalindrome(j))
				{
					//System.out.println("inside if");
					numberOfElements++;
				}
			}
			System.out.println(numberOfElements);
			y++;
		}
	}
	static boolean checkPalindrome(int num)
	{
		//System.out.println("inside function");
		char c[] = String.valueOf(num).toCharArray();
		int y=0,count=0;
		while(y < c.length)
		{
			if(c[y] == c[(c.length-1)-y])
			{
				//System.out.println("checking ifff");
				count++;
			}
			y++;
		}
		if(count == y)
		{
			return true;
		}
		return false;

	}

}
