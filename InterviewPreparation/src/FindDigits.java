import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class FindDigits {
	public static void main(String[] args) throws Exception {
		int arr[];
		int finalArray[];
		int middleArray[][];
		int valueToBeAssigned = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		arr = new int[testCases];
		// finalLength = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int j = 0;
		finalArray = new int[testCases];
		middleArray = new int[testCases][];
		for (int i = 0; i < testCases; i++) {
			valueToBeAssigned = 0;
			Integer number = arr[i];
			Integer copy = number;
			String str = number.toString();
			int length = str.length();
			middleArray[i] = new int[length];
			int k = 0;
			while (number > 0) {
				/*middleArray[i][k] = number % 10;
				number = number / 10;
				System.out.println(middleArray[i][k]);
				k++;
				*/
				int divisor = number%10;
				number = number/10;
				if(divisor == 0)
				{
					continue;
				}
				if(copy % divisor == 0)
				{
					valueToBeAssigned++;
				}
				finalArray[i] = valueToBeAssigned;
			}
			
		}
		for(int l=0;l<testCases;l++)
		{
			System.out.println(finalArray[l]);
		}
	}
}
