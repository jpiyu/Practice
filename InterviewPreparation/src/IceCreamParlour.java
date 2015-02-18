import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class IceCreamParlour {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int[] dollars = new int[testCases];
		int[] flavours = new int[testCases];
		int[][] arrays = new int[testCases][];
		int[][] results = new int[testCases][2];
		int y = 0;
		while (y < testCases) {
			dollars[y] = Integer.parseInt(br.readLine());
			flavours[y] = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			arrays[y] = new int[flavours[y]];
			for (int i = 0; i < str.length; i++) {
				arrays[y][i] = Integer.parseInt(str[i]);
			}
			y++;
		}
		y = 0;
		int num = 0;
		boolean toBreak = false;
		while (y < testCases) {
			toBreak = false;
			for (int i = 0; i < arrays[y].length; i++) {
				if (toBreak == false) {
					num = arrays[y][i];
					for (int j = i+1; j < arrays[y].length; j++) {
						if (i == j) {
							//System.out.println("equal");
							continue;
						}
						if ((num + arrays[y][j]) == dollars[y]) {
							//System.out.println(num + arrays[y][j]);
							results[y][0] = i+1;
							results[y][1] = j+1;
							toBreak = true;
							break;
						}
						//System.out.println("leaving this block");
					}
				}
				if (toBreak == true) {
					break;
				}
			}
			y++;
		}
		for (int i = 0; i < testCases; i++) {
			// for(int j=0;j<2;j++)
			// {
			System.out.println(results[i][0] + " " + results[i][1]);
			// }
		}
	}
}
