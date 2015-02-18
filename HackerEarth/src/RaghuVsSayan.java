import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class RaghuVsSayan {
	public static void main(String[] args) throws Exception
	{
		int testCases = 0;
		long totalDishes = 0;
		long[] array;
		String[] line1 = null;
		String[] line2 = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		//Scanner s = new Scanner(System.in);
		testCases = Integer.parseInt(br.readLine());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		int y =0;
		while(y <testCases)
		{
			try
			{
			line1 = br.readLine().split(" ");
			line2 = br.readLine().split(" ");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			long caloriesOfRaghu = Long.parseLong(line1[0]);
			long caloriesOfSayan = Long.parseLong(line1[1]);
			long caloriesSayanAte = 0;
			long caloriesRaghuAte = 0;
			long dishesRaghuAte = 0;
			long dishesSayanAte = 0;
			array = new long[line2.length];
			for(int i=0;i<Long.parseLong(line1[2]);i++)
			{
				array[i] = Long.parseLong(line2[i]);
			}
			Arrays.sort(array);
			for(int i=0;i<array.length;i++)
			{
				if(caloriesRaghuAte <= caloriesOfRaghu)
				{
				caloriesRaghuAte = caloriesRaghuAte + array[i];
				dishesRaghuAte++;
				}
				if(caloriesSayanAte <= caloriesOfSayan)
				{
				caloriesSayanAte = caloriesSayanAte + array[i];
				dishesSayanAte++;
				}
			}
			if(dishesRaghuAte > dishesSayanAte)
			{
				System.out.println("Raghu Won");
				//continue;
			}
			else if(dishesRaghuAte < dishesSayanAte)
			{
				System.out.println("Sayan Won");
				//continue;
			}
			else 
			{
				System.out.println("Tie");
			}
			y++;
		}
	}
}
