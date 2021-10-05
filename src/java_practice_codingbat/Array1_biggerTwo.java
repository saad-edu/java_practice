package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Start with 2 integer arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

public class Array1_biggerTwo {

	public static void main(String[] args) {
		int[] a, b;
		a = getArray();
		System.out.println("First array is " + Arrays.toString(a));
		b = getArray();
		System.out.println("Second array is " + Arrays.toString(b));
		System.out.println(biggerTwo(a, b));
		
	}

	public static int[] getArray() {
		int arraySize;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		arraySize = input.nextInt();
		int[] nums = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter array element " + (i + 1) + ": ");
			nums[i] = input.nextInt();
		}
		
		input.close();
		return nums;

	}

	public static int[] biggerTwo(int[] a, int[] b) {
		return a[0] + a[1] >= b[0] + b[1] ? a : b;
	}

}
