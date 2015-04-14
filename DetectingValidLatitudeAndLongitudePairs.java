import static java.lang.System.*;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DetectingValidLatitudeAndLongitudePairs {
	static boolean b1,b2;
	static Matcher m1,m2;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String[] array = null;
		String patternX = "[(][+-]?[1-9]+[0-9]*[.]?[0-9]*[,]";
		String patternY = "[+-]?[0-9]*[.]?[0-9]*[)]";
		Pattern p1 = Pattern.compile(patternX);
		Pattern p2 = Pattern.compile(patternY);
		String sub1 = null,sub2 = null;
		while(testCases-->= 0)
		{
			System.out.println("entering");
		
			array = br.readLine().split(" ");
			System.out.println("splitted");
				m1 = p1.matcher(array[0]);
				m2 = p2.matcher(array[1]);
				System.out.println(array[0] + "---" + array[1]);
				/*if(array[0].contains("+") || array[0].contains("-"))
				{
				sub1 = array[0].substring(2, array[0].length()-1);
				}
				else
				{
					sub1 = array[0].substring(1,array[0].length()-1);
				}
				if(array[1].contains("+") || array[1].contains("-"))
				{
				sub2 = array[1].substring(1,array[1].length()-1);
				}
				else
				{
					sub2 = array[1].substring(0, array[1].length()-1);
				}*/
				sub1 = array[0].substring(1,array[0].length()-1);

				sub2 = array[1].substring(0, array[1].length()-1);

				//System.out.println(sub1 + "   " + sub2);
				double num1 = Double.parseDouble(sub1);
				double num2 = Double.parseDouble(sub2);
				//System.out.println("number1 = " + num1 + "  " + "number2" + num2);
				//System.out.println("x obeys " + m1.matches() + "------------" + "y obeys " + m2.matches());
				b1 = m1.matches();
				b2 = m2.matches();
				//System.out.println(b1 + "      " + b2);
				if(b1 && b2 && num1 <= 180 && num1 >= -180 && num2 <= 180 && num2 >= -180)
				{
					System.out.println("Valid");
				}
				else
				{
					System.out.println("Invalid");
				}
				System.out.println("bottom");
			//testCases--;
		}
	}
}
