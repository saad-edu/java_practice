package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

public class Array2_sum67 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println("array is " + Arrays.toString(nums));
		System.out.println(sum67(nums));

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

	public static int sum67(int[] nums) {
		  int sum=0;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==6) {
		      for(int j=i;nums[j]!=7;j++) i++;
		    }
		    else sum+=nums[i];
		  }
		  return sum;
		}

}

//More efficient method:
//public int sum67(int[] nums) {
//	  int sum = 0;
//	  boolean stop = false;
//
//	  for (int i = 0; i < nums.length; i++) {
//	    if (nums[i] == 6)
//	      stop = true;
//	    if (stop == false)
//	      sum += nums[i];
//	    if (nums[i] == 7 && stop == true)
//	      stop = false;
//	  }
//	  return sum;
//	}
