


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimumDraws{

       /**
        * @param args
        */
       static BufferedReader in = new BufferedReader(new InputStreamReader(
                     System.in));

       //we need minimum of (noOfPairs+1) socks to get a matched pair of socks
       public static int minimumDraw(int noOfPairs)
      {
      return (noOfPairs+1);
    }
       public static void main(String[] args) throws NumberFormatException,
                     Exception {
             
              int T = Integer.parseInt(in.readLine());
        //T test cases follow
        for(int i=0;i<T;i++)
          {
          int noOfPairs = Integer.parseInt(in.readLine());
          System.out.println(minimumDraw(noOfPairs));
        }
       
        in.close();
             
             

       }
}