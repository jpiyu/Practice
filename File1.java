import static java.lang.System.*;
class File1
{
  public static void main(String[] args)
  {
    sum(10,20,30,40,50,60);
  }
  public static void sum(int... x)
  {  
    int sum =0;                      
    for(int j=0;j<x.length;j++)
    {
       sum = sum + x[j];
    }
    System.out.println(sum);
  }
}


