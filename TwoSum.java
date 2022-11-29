package Day28Nov2022;

import java.util.Arrays;

import org.junit.Test;

public class TwoSum {

	@Test
	public void td1() {
		int[] nums = { 1, 2, 3, 4 };
		int target = 7;
		int[] twoSum = twoSumII(nums, target);
		System.out.println(Arrays.toString(twoSum));
	}

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};

	}

	public int[] twoSumII(int[] nums, int target) {

		int start = 0, end = nums.length - 1, sum = 0;

		while (start < end) {
			sum = nums[start] + nums[end];

			if (sum == target) {
				nums[0] = start;
				nums[1] = end;
				break;
			} else if (sum < target) {
				start++;
			} else {
				end--;

			}

		}

		return new int[] {start, end };

	}

}
