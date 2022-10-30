package KadaneAndThreePointerAlogrithm;

import org.junit.Test;

public class kadaneConcepts {

	@Test
	public void td1() {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maximumSubarray = maximumSubarray(nums);
		System.out.println(maximumSubarray);
	}

	@Test
	public void td2() {
		int[] nums = { -2, 1, 3, 3 };
		int maximumSubarray = maximumSubarray(nums);
		System.out.println(maximumSubarray);
	}
	
	@Test
	public void td3() {
		int[] nums = { -1,2,3,4 };
		int maximumSubarray = minmumSubarray(nums);
		System.out.println(maximumSubarray);
	}
	
	@Test
	public void td4() {
		int[] nums = { -2, -1, -3};
		int maximumSubarray = maximumSubarray(nums);
		System.out.println(maximumSubarray);
	}
	
	
	/**
	 * Initial maximum =0 and sum =0
	 * loop 0 to end of the length
	 * if max is less than zero reset sum =0
	 * if max is greater than or equal to zero add the current index value to sum
	 * Assign max with max of max and sum
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param nums
	 * @return
	 */
	

	public int maximumSubarray(int[] nums) {

		if (nums.length == 1)
			return nums[0];

		int max = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			
			if (sum < 0) {
				max = Math.max(max, sum);
			    sum = 0;
			}
			max = Math.max(max, sum);
		}

		return max;

	}
	
	public int minmumSubarray(int[] nums) {

		if (nums.length == 1)
			return nums[0];

		int min = Integer.MAX_VALUE, sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum < 0) {
				min = Math.min(min, sum);
				sum = 0;
			}
			min = Math.min(min, sum);
		}

		return min;

	}

}
