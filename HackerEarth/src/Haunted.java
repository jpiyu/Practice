
/* IMPORTANT: class must not be public. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Haunted {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String arr[] = line.split(" ");
		int NoOfDays = Integer.parseInt(arr[0]);
		long NoOfGhosts = Integer.parseInt(arr[1]);
		line = br.readLine();
		String ghostOfDayTitleWinners[] = line.split(" ");
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int prevConsistent = 0;
		int currConsistent = 0;
		int maxValue = Integer.MIN_VALUE;
		int dayWinner = 0;
		Integer dayWinnerCount = 0;
		for (int i = 0; i < NoOfDays; i++) {
			dayWinner = Integer.parseInt(ghostOfDayTitleWinners[i]);
			if (hm.containsKey(dayWinner)) {
				hm.put(dayWinner, hm.get(dayWinner) + 1);
			} else {
				hm.put(dayWinner, 1);
			}
			dayWinnerCount = hm.get(dayWinner);
			if (maxValue < dayWinnerCount) {
				currConsistent = dayWinner;
				prevConsistent = currConsistent;
				maxValue = dayWinnerCount;
			} else if (maxValue == dayWinnerCount) {
				if (prevConsistent > dayWinner) {
					currConsistent = prevConsistent;
				} else {
					currConsistent = dayWinner;
					prevConsistent = currConsistent;
				}
			} else {
				currConsistent = prevConsistent;
			}
			System.out.println("" + currConsistent + " " + maxValue);
		}
	}
}
