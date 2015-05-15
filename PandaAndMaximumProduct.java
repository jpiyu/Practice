/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class PandaAndMaximumProduct {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int elements = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<str.length;i++)
        {
        	//System.out.println(Integer.parseInt(str[i]));
        	list.add(Integer.parseInt(str[i]));
        }

		Collections.sort(list);
		//System.out.println(list);
       	int p1 = list.get(list.size()-1);
       	//list.remove(list.get(list.size()-1));
       	//System.out.println("hello" + p);
       	//System.out.println(list.size());
       	int q1 = list.get(list.size()-2);

       	int p2 = list.get(0);
       	int q2 = list.get(1);

       	int product1 = p1*q1;
       	int product2 = p2*q2;

       	System.out.println((product1 > product2) ? product1 : product2);
    }
}
