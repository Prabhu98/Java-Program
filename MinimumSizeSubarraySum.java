import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySum {
	
	
	@Test
	public void example1() {
		int[] nums = {2,3,1,4,3};
		int target =7;
		int minSubArrayLen = minSubArrayLen(target ,nums);
		System.out.println(minSubArrayLen);
				
	}
	
	@Test
	public void example2() {
		int[] nums = {1,4,4};
		int target =4;
		int minSubArrayLen = minSubArrayLen(target ,nums);
		System.out.println(minSubArrayLen);
				
	}
	
	@Test
	public void example3() {
		int[] nums = {1,1,1,1,1,1,1,1};
		int target =11;
		int minSubArrayLen = minSubArrayLen(target ,nums);
		System.out.println(minSubArrayLen);
				
	}
	
	/**
	 * Initialize right =0, left =0 , sum=0, currentLength=0 & min =Integer.MAX_VALUE
	 * Iterate for loop for 0 to nums.length
	 * add each value to the sum
	 * while(sum>=target)
	 * then currentLength = right-left+1
	 * Store the min value
	 * Sum = sum-nums[left]
	 * left incremented by
	 * If no subarray return 0
	 * return min
	 * 
	 * 
	 * 
	 * 
	 * @param target
	 * @param nums
	 * @return
	 */
	
	public int minSubArrayLen(int target ,int nums[]) {
		
	//Two Pointer grow and Shrink
		
		int right =0,left=0,sum=0,currentLength=0, min= Integer.MAX_VALUE;
		
		for(;right<nums.length;right++) {
			
			sum += nums[right];
			
			while(sum >=target) {
				currentLength = right -left+1;//3
				sum = sum - nums[left];
				left++;
				min = Math.min(min, currentLength);//3
				
			}
			
		}
		min = Math.min(min, currentLength);
		return min;
		
	}
	

}
