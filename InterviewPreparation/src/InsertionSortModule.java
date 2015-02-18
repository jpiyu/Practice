import static java.lang.System.*;
import java.io.*;
public class InsertionSortModule {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		int[] sortedArray = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			sortedArray[i] = Integer.parseInt(array[i]);
		}
		int elementToInsert = sortedArray[sortedArray.length - 1];
		//System.out.println(elementToInsert);
		for(int i=array.length -2;i>=0;i--)
		{
			if(elementToInsert < sortedArray[i])
			{
				sortedArray[i+1] = sortedArray[i];
				for(int k=0;k<sortedArray.length;k++)
				{
					System.out.print(sortedArray[k] + " ");
				}
				System.out.println();
				if(i == 0)
				{
					sortedArray[i] = elementToInsert;
					for(int k=0;k<sortedArray.length;k++)
					{
						System.out.print(sortedArray[k] + " ");
					}
					System.out.println();
					break;
				}
			}
			if (elementToInsert > sortedArray[i])
			{
				sortedArray[i+1] = elementToInsert;
				for(int k=0;k<sortedArray.length;k++)
				{
					System.out.print(sortedArray[k] + " ");
				}
				System.out.println();
				break;
			}
			

		}
		/*for(int k=0;k<sortedArray.length;k++)
		{
			System.out.print(sortedArray[k] + " ");
		}*/
	}
}
