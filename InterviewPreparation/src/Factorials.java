    import java.math.BigInteger;
    import java.util.Scanner;
    
    public class Factorials {
     
    /**
    * @param args the command line arguments
    */
    private static BigInteger[] factorial = new BigInteger[101];
    public static void main(String[] args) {
    // TODO code application logic here
    int T,i;
    int N;
    for(i=0;i<101;i++){
    factorial[i]=BigInteger.ZERO;
    }
    factorial[0]=BigInteger.ONE;
    factorial[1]=BigInteger.ONE;
    Scanner input = new Scanner(System.in);
    T = input.nextInt();
    while(T>0){
    N = input.nextInt();
    System.out.println(factorialOf(N));
    T--;
    }
    }
     
    static BigInteger factorialOf(int N){
    if(factorial[N].compareTo(BigInteger.ZERO) !=0){
    return factorial[N];
    }
    factorial[N] = BigInteger.valueOf(N).multiply(factorialOf(N-1));
    return factorial[N];
    }
    }