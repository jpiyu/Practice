import java.util.*;
import java.io.*;
public class WhatIsTheStringMadeOf {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int index =0;
		int result = 0;
		while(index < str.length())
		{
			char c = str.charAt(index);
			switch(c)
			{
			case '0':
				result = result+6;
				break;
			case '1':
				result = result+2;
				break;	
			case '2':
				result = result+5;
				break;	
			case '3':
				result = result+5;
				break;
			case '4':
				result = result+4;
				break;	
			case '5':
				result = result+5;

				break;	
			case '6':
				result = result+6;

				break;	
			case '7':
				result = result+3;

				break;	
			case '8':
				result = result+7;

				break;	
			case '9':
				result = result+6;

				break;	
					
			}
			index++;
		}
		System.out.println(result);
	}

}
