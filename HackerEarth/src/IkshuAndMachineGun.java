

    /* IMPORTANT: class must not be public. */
     
    /*
    * uncomment this if you want to read input.*/
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
     
    class TestClass {
    public static void main(String args[] ) throws Exception {
    /*
    * Read input from stdin and provide input before running
    */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    String line = br.readLine();
    String[] numbersStr = line.split(" ");
    Integer[] numbers = strArrayToIntArray(numbersStr);
    java.util.Arrays.sort(numbers);
    int output = 0,count = 0;
    for (int j = 0; j<numbers.length; j++) {
    System.out.print((numbers[j]-j)+" ");
    }
    }
    private static Integer[] strArrayToIntArray(String[] strArr) {
    Integer[] intArr = new Integer[strArr.length];
    for(int i = 0; i < strArr.length; i++) {
    intArr[i] = Integer.parseInt(strArr[i]);
    }
    return intArr;
    }
    }
