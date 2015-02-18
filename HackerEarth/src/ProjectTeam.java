


import java.util.Arrays;
import java.util.Scanner;

public class ProjectTeam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 0; t < tc; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			Arrays.sort(arr);
			int max = arr[0] + arr[N - 1];
			int min = arr[0] + arr[N - 1];
			for (int i = 0, j = N - 1; i < j; i++, j--) {
				if (arr[i] + arr[j] > max)
					max = arr[i] + arr[j];
				if (arr[i] + arr[j] < min)
					min = arr[i] + arr[j];
			}
			System.out.println(max - min);
		}

	}

}

