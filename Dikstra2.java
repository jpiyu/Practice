import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Dikstra2 {
	static String inputFileName = "";
	static String outputFileName = "";
	static String finalString = "";
	static int[][] array = {{1,2,3,4},
		{2,-1,4,3},
		{3,-4,-1,2},
		{4,3,-2,-1}};
	public static void main(String[] args) throws Exception
	{/*
		File ifn = new File(inputFileName);
		File ofn = new File(outputFileName);
		BufferedReader br1 = new BufferedReader(new FileReader(ifn));
		BufferedWriter br2 = new BufferedWriter(new FileWriter(ofn));*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int y = testCases;
		while(y <= testCases)
		{
			boolean possible = false;
			String[] constraints = br.readLine().split(" ");
			String str = br.readLine();
			char[] c = new char[Integer.parseInt(constraints[0])];
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
			//finalString = convert(finalString);

			System.out.println(finalString);
			if(finalString.length() < 3)
			{
				possible = false;
				System.out.println("No");
				continue;
			}
			for(int i=1;i<finalString.length();i++)
			{
				String subString = finalString.substring(0, i);
				System.out.println(subString);
				if(check(i,subString))
				{

					for(int l=index+1;l<finalString.length();l++)
					{
						String subString2 = finalString.subString(index,l);
						if(checkForJ(l,subString2)
								{
									for(int m = l+1;m<finalString.length();m++)
									{
										String subString3 = finalString.subString(l,m);
										if(checkForK(subString)
										{
											System.out.println("YES");
										}
									}
								}
					}

					y++;
				}
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

		static boolean check(int index,String subString)
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
