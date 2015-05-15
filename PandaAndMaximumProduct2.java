/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class PandaAndMaximumProduct2 {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int elements = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        //LinkedList<Integer> list = new LinkedList<Integer>();
        Long[] arr = new Long[elements];
        for(int i=0;i<str.length;i++)
        {
        	//System.out.println(Integer.parseInt(str[i]));
        	//list.add(Integer.parseInt(str[i]));
        	arr[i] = Long.parseLong(str[i]);
        }

		Arrays.sort(arr);
		//System.out.println(list);
       	long p1 = arr[arr.length-1];
       	//list.remove(list.get(list.size()-1));
       	//System.out.println("hello" + p);
       	//System.out.println(list.size());
       	long q1 = arr[arr.length-2];

       	long p2 = arr[0];
       	long q2 = arr[1];

       	long product1 = p1*q1;
       	long product2 = p2*q2;

       	System.out.println((product1 > product2) ? product1 : product2);
    }
}
