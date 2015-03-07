import static java.lang.System.*;
import java.util.*;
class VectorsMethod
{
 public static void main(String args[])
 {
 // read in an arbitrary number of strings
 Scanner s = new Scanner(System.in);
 Vector<String> data;
 // allocate vector for storage
 data = new Vector<String>();
 // read strings, adding them to end of vector, until eof
 while (s.hasNext())
 {
 String st = s.next();
 data.add(st);
 }
}
}