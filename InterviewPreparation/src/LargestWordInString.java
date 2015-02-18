import java.util.*; 
import java.io.*;

public class LargestWordInString {  
  String LongestWord(String sen) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       String[] arr = sen.split(" ");
       int max = 0;
      for(int i=0;i<arr.length;i++)
      {
        max = i;
        for(int j=1;j<arr.length;j++)
        {
          if((arr[j].length()) > (arr[max].length()))
          {
            max = j;
          }
        }
      }

    return arr[max];
    
  } 
  
  public static void main (String[] args) throws Exception {  
    // keep this function call here     
    //Scanner  s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LargestWordInString c = new LargestWordInString();
    System.out.print(c.LongestWord(br.readLine())); 
  }   
  
}








  