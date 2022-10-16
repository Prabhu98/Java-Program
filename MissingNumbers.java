package TestLeafJavaProgram;

import java.util.Iterator;

import org.junit.Test;

public class MissingNumbers {
	
	@Test
	public static void postive() {
		int[] nums = {3,0,1};
		int missingNumber = missingNumber(nums);
		System.out.println(missingNumber);	
		
	}
	
	@Test
	public static void negative() {
		int[] nums = {};
		int missingNumber = missingNumber(nums);
		System.out.println(missingNumber);		
		
	}
	
	@Test
	public static void edge() {
		int[] nums = {2};
		int missingNumber = missingNumber(nums);
		System.out.println(missingNumber);	
		
	}
	
	/**
	 * Initialize sum =0
	 * to get length of the given array
	 * iterate each value and add to the sum
	 * sum all the values including the missing number
	 * using n*(n+1)/2
	 * Difference sum and sumall
	 * return the value
	 * 
	 *
	 */
	
	 public static int missingNumber(int[] nums) {
		 
		 
		 int n = nums.length;
		 
		 int sum =0;
		 
		 for(int i=0;i<nums.length;i++) {
			 sum += nums[i];
		 }
		 int sumall = n*(n+1)/2;
		 
		 return sumall-sum;
	 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//postive();
		//negative();
		edge();

	}

}
