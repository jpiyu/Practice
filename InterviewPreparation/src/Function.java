import java.util.*; 
import java.io.*;

class Function {  
	String sr;
  String LetterCapitalize(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
	 //char[] c = str.toCharArray();
	 String[] array = str.split(" ");
	 for(int i=0;i<array.length;i++)
	 {
		 array[i].toCharArray()[0] = (char)(array[i].toCharArray()[0] - 32);
		// c[0] = (char)(c[0] - 32);
		 
		 sr = sr + new String(array[i]);
	 }
    return sr;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterCapitalize(s.nextLine())); 
  }   
  
}








  