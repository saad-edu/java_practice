package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given 2 integer arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

public class Array1_middleWay {

	public static void main(String[] args) {
		int[] a,b;
		a = getArray();
		System.out.println("First array is " + Arrays.toString(a));
		b = getArray();
		System.out.println("Second array is " + Arrays.toString(b));
		System.out.println(Arrays.toString(middleWay(a,b)));

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

	public static int[] middleWay(int[] a, int[] b) {
		  return new int[]{a[1],b[1]};
		}

}
