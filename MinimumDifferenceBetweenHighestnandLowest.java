package Day5;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class MinimumDifferenceBetweenHighestnandLowest {
	

	@Test
	public void example1(){
		int[] nums = {9,4,1,7};
		int k =2;
		int minimumDifference = minimumDifference(nums,k);
		System.out.println(minimumDifference);
		
	}
	
	@Test
	public void example2(){
		int[] nums = {9};
		int k =2;
		int minimumDifference = minimumDifference(nums,k);
		System.out.println(minimumDifference);
		
	}
	@Test
	public void example3(){
		int[] nums = {9,9,9,9};
		int k =2;
		int minimumDifference = minimumDifference(nums,k);
		System.out.println(minimumDifference);
		
	}
	/***
	 * 
	 * Sort the Array in lowest order
	 * initialize diff =0
	 * traversal for loop from 1 to nums.length
	 * assign to diff nums[i] - nums[i-k+1];
	 * get the min value
	 * return min value
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	
	
	
	
    public int minimumDifference(int[] nums, int k) {
	  
	Integer min = Integer.MAX_VALUE;
	
	Arrays.sort(nums);
	
	int diff =0;
	
	for(int i=1;i<nums.length;i++) {
		diff = nums[i] - nums[i-k+1];
	}
	
	min =Math.min(min, diff);
	return min;
        
    }

}
