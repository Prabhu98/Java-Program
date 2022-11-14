package Day13Nov2022;

import org.junit.Test;

public class MaximumSequenceOfOnes {

	@Test
	public void td1() {
		int A[] = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
		int k = 2;
		int findLongestSequence = findLongestSequence(A, k);
		System.out.println(findLongestSequence);
	}

	public int findLongestSequence(int[] A, int k) {

		int start = 0, end = 0, max = 0, countzero = 0;

		while (end < A.length) {

			if (A[end] == 0) {
				countzero++;
				
			}
			
			while (countzero > k) {
				if (A[start] == 0) {
					countzero--;
				}
				start++;
			}

			max = Math.max(max, end - start + 1);
			end++;
		}

		return max;

	}

}
