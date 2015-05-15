/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int elements = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        //LinkedList<Integer> list = new LinkedList<Integer>();
        Long[] list = new Long[elements];
        for(int i=0;i<str.length;i++)
        {
        	//System.out.println(Integer.parseInt(str[i]));
        	//list.add(Integer.parseInt(str[i]));
        	list[i] = Long.parseLong(str[i]);
        }

		Arrays.sort(list);

		long p = list[list.length-1];
		long q = list[list.length-2];

       	System.out.println(p*q);
    }
}
