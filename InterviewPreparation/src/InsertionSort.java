// concept of insertion sort is just like arranging a deck of cards , select one and insert it into the previously sorted deck of sorted cards

import static java.lang.System.*;
import java.io.*;

public class InsertionSort {
	static int finalArray[];
	static String enteredArray[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of the array your want to sort");
		int size = Integer.parseInt(br.readLine());
		System.out
				.println("enter the elements of the array you want to sort with spaces");
		enteredArray = (br.readLine()).split(" ");
		finalArray = new int[enteredArray.length];
		for (int i = 0; i < enteredArray.length; i++) {
			finalArray[i] = Integer.parseInt(enteredArray[i]);
		}
		// now here comes the sorting part , we are gonna call a function to
		// sort the array
		finalArray = insertionSort(finalArray);
		show(finalArray);
	}

	public static int[] insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[i] < arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void show(int[] arr) {
		for (Integer a : arr) {
			System.out.println(a);
		}
	}
}
