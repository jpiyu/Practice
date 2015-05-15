import static java.lang.System.*;

import java.io.*;

class MainClass {
	static int testcases;
	public static void main(String args[]) throws Exception
	{
		long basicStep = 2,i=0,total=0,jumps=0;
		//out.println("enter the number of test cases");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		testcases = Integer.parseInt(br.readLine());
		while(i < testcases)
		{
			//out.println("enter the distance");
			long distance = Integer.parseInt(br.readLine());
            if(distance == 1)
                {
                System.out.println(1);
                System.exit(0);
            }
            else
             {
			while((total+basicStep) <= distance)
			{
					/*total = total+basicStep;
					basicStep = basicStep*2;
					jumps++;*/
				
				total = total + basicStep;
				basicStep++;
				jumps++;
			}
			long diff = distance - total;
			jumps = jumps + diff;
			out.println(jumps);
			i++;
            }
		}
	}

}
