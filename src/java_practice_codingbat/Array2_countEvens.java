package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Return the number of even integers in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public class Array2_countEvens {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println("array is " + Arrays.toString(nums));
		System.out.println(countEvens(nums));
		
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

	public static int countEvens(int[] nums) {
		  int count = 0;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]%2==0) count++;
		  }
		  return count;
		}

}
