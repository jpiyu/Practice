//package gcjd;
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class NewSolution {
	static String inputFileName = "C-small-attempt0.in";
	static String outputFileName = "output12.out";
	static String finalString = "";
	static int[][] array = {{1,2,3,4},
		{2,-1,4,3},
		{3,-4,-1,2},
		{4,3,-2,-1}};
	static boolean done = false;
	//static String[] constraints;
	static String str;
	static char[] c;
	public static void main(String[] args) throws Exception
	{
		File ifn = new File(inputFileName);
		File ofn = new File(outputFileName);
		BufferedReader br = new BufferedReader(new FileReader(ifn));
		BufferedWriter bw = new BufferedWriter(new FileWriter(ofn));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int y = 1;
		while(y <= testCases)
		{
			String[] constraints = br.readLine().split(" ");
			str = br.readLine();
			c = new char[Integer.parseInt(constraints[0])];
			for(int i=0;i<str.length();i++)
			{
				char h = str.charAt(i);
				if(h == 'i')
				{
					c[i] = '2';
				}
				else if(h == 'j')
				{
					c[i] = '3';
				}
				else if(h == 'k')
				{
					c[i] = '4';
				}
			}

			str = new String(c);
			int iters = Integer.parseInt(constraints[1]);
			while(iters > 0)
			{
				finalString = finalString + str;
				iters--;
			}

			//System.out.println(finalString);
			if(Integer.parseInt(constraints[0]) == 1)
			{
				done = false;
			}
			else if(finalString.length() < 3)
			{
				//System.out.println("inside this");
				done = false;
			}
			else if(finalString.length() == 3)
			{
				if(finalString.charAt(0) == '2' && finalString.charAt(1) == '3' && finalString.charAt(2) == '4')
				{
					done = true;

				}
				else
				{
					done = false;
				}
			}
			/**else if((!finalString.contains("j") && !finalString.contains("k") && finalString.contains("i"))  || (!finalString.contains("i") && finalString.contains("j") && finalString.contains("k")) || (!finalString.contains("k") && !finalString.contains("i") && finalString.contains("j")))
					{
						done = false;
					}**/
			else
			{
				for(int i=1;i<finalString.length();i++)
				{
					System.out.println("entering");
					if(done == true)
					{
						break;
					}
					String subString = finalString.substring(0, i);
					//System.out.println(subString);
					if(check(i,subString))
					{
						//System.out.println("got i");
						for(int l=i+1;l<finalString.length();l++)
						{
							if(done == true)
							{
								break;
							}
							String subString2 = finalString.substring(i,l);
							if(checkForJ(l,subString2))
							{
								//System.out.println("got j");
								//System.out.println(subString2);
								for(int m = l+1;m<finalString.length();m++)
								{
									String subString3 = finalString.substring(l,finalString.length());
									//System.out.println("the substring here is " + subString3);
									if(checkForK(subString3))
									{
										//System.out.println("YES");
										//System.out.println("checking");
										done = true;
									}
								}
							}
						}

					}

				}
			}
			if(done == true)
			{
				bw.write("Case #" + y + ": " +"YES");
				bw.newLine();

			}
			else
			{
				bw.write("Case #" + y + ": " + "NO");
				bw.newLine();
			}
			finalString = "";
			done = false;
			y++;
		}

		br.close();
		bw.close();
	}


	static boolean check(int index,String subString)
	{
		boolean status = false;
		int value1=0,value2=0;
		int finalValue = 0;
		int signBit = 0;
		if(subString.length() == 1)
		{
			if(subString.equals("i"))
			{
				status = true;
			}
		}
		else
		{
			for(int i=0;i<subString.length()-1;i++)
			{
				if(finalValue == 0)
				{
					value1 = (int)(subString.charAt(i)-'0');
				}
				else
				{
					value1 = finalValue;
				}
				value2 = (int)(subString.charAt(i+1)-'0');
				finalValue = array[(value1)-1][(value2)-1];
				if(finalValue < 0 && signBit == 0)
				{
					finalValue = -finalValue;
					signBit = 1;
				}
				else if(finalValue < 0 && signBit == 1)
				{
					finalValue = -finalValue;
					signBit = 0;
				}
				//System.out.println(finalValue + "  " + value1 + "  " + value2);
			}
		}
		if(signBit == 0 && finalValue == 2)
		{
			status = true;
		}
		return status;
	}

	static boolean checkForJ(int index,String subString)
	{
		boolean status = false;
		int value1=0,value2=0;
		int finalValue = 0;
		int signBit = 0;
		if(subString.length() == 1)
		{
			if(subString.equals("j"))
			{
				status = true;
			}
		}
		else
		{
			for(int i=0;i<subString.length()-1;i++)
			{
				if(finalValue == 0)
				{
					value1 = (int)(subString.charAt(i)-'0');
				}
				else
				{
					value1 = finalValue;
				}
				value2 = (int)(subString.charAt(i+1)-'0');
				finalValue = array[(value1)-1][(value2)-1];
				if(finalValue < 0 && signBit == 0)
				{
					finalValue = -finalValue;
					signBit = 1;
				}
				else if(finalValue < 0 && signBit == 1)
				{
					finalValue = -finalValue;
					signBit = 0;
				}
				//System.out.println(finalValue + "  " + value1 + "  " + value2);
			}
		}
		if(signBit == 0 && finalValue == 3)
		{
			status = true;
		}
		return status;
	}


	static boolean checkForK(String subString)
	{
		boolean status = false;
		int value1=0,value2=0;
		int finalValue = 0;
		int signBit = 0;
		if(subString.length() == 1)
		{
			if(subString.equals("k"))
			{
				status = true;
			}
		}
		else
		{
			for(int i=0;i<subString.length()-1;i++)
			{
				if(finalValue == 0)
				{
					value1 = (int)(subString.charAt(i)-'0');
				}
				else
				{
					value1 = finalValue;
				}
				value2 = (int)(subString.charAt(i+1)-'0');
				finalValue = array[(value1)-1][(value2)-1];
				if(finalValue < 0 && signBit == 0)
				{
					finalValue = -finalValue;
					signBit = 1;
				}
				else if(finalValue < 0 && signBit == 1)
				{
					finalValue = -finalValue;
					signBit = 0;
				}
				//System.out.println(finalValue + "  " + value1 + "  " + value2);
			}
		}
		if(signBit == 0 && finalValue == 4)
		{
			status = true;
		}
		return status;
	}
}
