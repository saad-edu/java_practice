package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, return the number of 9's in the array.

public class Warmup2_arrayCount9 {
	
	
	
	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(arrayCount9(nums));

	}
	
	public static int[] getArray() {
		int arraySize;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		arraySize = input.nextInt();
		int[] nums = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter array element " + (i+1) + ": ");
			nums[i] = input.nextInt();
		}
		
		input.close();
		return nums;
		
	}

	public static int arrayCount9(int[] nums) {
		  int count = 0;
		  for(int num: nums) if(num == 9) count++;
		  return count;
	}
}
