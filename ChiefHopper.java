import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ChiefHopper {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int elements = Integer.parseInt(br.readLine());
		double arr[] = new double[elements];
		String array[] = br.readLine().split(" ");
		for(int i=0;i<elements;i++)
		{
			arr[i] = Double.parseDouble(array[i]);
		}
		double initialEnergy = 0;
		for(int j=elements-1;j>=0;j--)
		{
			initialEnergy = Math.ceil((initialEnergy + arr[j]) / 2 );
		}
		System.out.println((int)initialEnergy);
	}
}
