import java.util.*; 
import java.io.*;

public class ChangingLetters {  
  String LetterChanges(String srt) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
	  char c[] = srt.toCharArray();
    for(int i=0;i<c.length;i++)
        {
          char c1 = c[i];
          if(isAlphabet(c1))
          {
        	  c[i] = (char)(c1+1);
          }
        }
        for(int j=0;j<c.length;j++)
        {
             char c2 = c[j];
             if((c2 == 'a')) //|| (c2 == 'e') || (c2 == 'i') || (c2 == 'o') || (c2 == 'u'))
             {
            	 c[j] = 'A';
             }
             else if(c2 == 'e')
             {
            	 c[j] = 'E';
    
             }
             else if(c2 == 'i')
            	 c[j] = 'I';
             else if(c2 == 'o')
            	 c[j] = 'O';
             else if(c2 == 'u')
            	 c[j] = 'U';
          
        }
    return new String(c);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    ChangingLetters c = new ChangingLetters();
    System.out.print(c.LetterChanges(s.nextLine())); 
  }   
  boolean isAlphabet(char c1)
  {
	  if((97<(int)c1) && c1<122)
	  {
		 return true; 
	  }
	  return false;
  }
}








  