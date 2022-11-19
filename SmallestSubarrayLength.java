package Day18Nov2022;

import org.junit.Test;

public class SmallestSubarrayLength {

	/**
	 * 
	 * Find the smallest subarray length whose sum of elements is greater than `k`
	 * Google Translate Icon Given an array of positive integers, find the smallest
	 * subarray’s length whose sum of elements is greater than a given number k.
	 * 
	 * For example,
	 * 
	 * Input: {1, 2, 3, 4, 5, 6, 7, 8}, k = 20 Output: The smallest subarray length
	 * is 3 Explanation: The smallest subarray with sum > 20 is {6, 7, 8}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void td1() {
          int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
          int k = 21;
          int findSmallestSubarrayLen = findSmallestSubarrayLen(A,k);
          System.out.println(findSmallestSubarrayLen);
          
          
	}

	public static int findSmallestSubarrayLen(int[] A, int k)

	{
		
		if(A.length == 0) return 0;
		
		int sum = 0, len = Integer.MAX_VALUE;

		int left = 0;

		for (int right = 0; right < A.length; right++) {

			sum += A[right];

			while (sum >= k && left <= right) {
				len = Math.min(len, right - left + 1);
				sum -= A[left];
				left++;
			}
		}

		return len;
	}
}
