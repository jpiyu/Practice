import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CheckingTraingle {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String []str = s.nextLine().split(" ");
		int[] array = new int[str.length];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<str.length;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				
				int sum = array[i] + array[j];
				map.put(Integer.valueOf(i+""+j),sum);
				
			}
		}
		int size = map.size();
		/*for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<size;j++)
			{
				
				if(num > array[i])
				{
					System.out.println(array[i] + "" + num);
				}
			}
		}*/
	}
}
