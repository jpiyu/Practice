import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class DetectTheEmailAddress {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(br.readLine());
		LinkedList<String> list = new LinkedList<String>();
		int y = 0;
		while(y < lines)
		{
			list.add(br.readLine());
			y++;
		}
		Iterator iter = list.iterator();
		String[] resultArray = new String[lines];
		int indexForResultArray = 0;
		StringBuilder resultString = new StringBuilder();
		while(iter.hasNext())
		{
			String[] temp = ((String)iter.next()).split(" ");
			for(int i=0;i<temp.length;i++)
			{
				String str = temp[i];
				if(str.contains("@") && str.contains("."))
				{
					resultArray[indexForResultArray++] = str;
				}
			}
		}
		Arrays.sort(resultArray);
		for(int i=0;i<resultArray.length-1;i++)
		{
			resultString.append(resultArray[i]);
			resultString.append(";");
		}
		resultString.append(resultArray[resultArray.length-1]);
		System.out.println(resultString);
	}
}
