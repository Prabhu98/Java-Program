package KadaneAndThreePointerAlogrithm;

import java.util.Arrays;

import org.junit.Test;

public class DutchFlagThreePointer {

	@Test
	public void td1() {
		int[] nums = {1, 0, 1, 2, 2 };
		int[] sortOrder = sortAscendingOrder(nums);
		System.out.println(Arrays.toString(sortOrder));
	}
	
	@Test
	public void td2() {
		int[] nums = { 1, 2, 0, 1, 2 };
		int[] sortOrder = sortDescendingOrder(nums);
		System.out.println(Arrays.toString(sortOrder));
	}
	/*
	 * @Test public void td2() { int[] nums = { -2, 1, 3, 3 }; int[] sortOrder =
	 * sortAscendingOrder(nums); System.out.println(sortOrder); }
	 */

	public int[] sortAscendingOrder(int[] input) {
		int low = 0, middle = 1, high = input.length - 1;

		while (middle <= high) {
			if (input[middle] == 0) {
				int temp = input[middle];
				input[middle] = input[low];
				input[low] = temp;
				middle++;
				low++;
			} else if (input[middle] == 1) {
				middle++;
			} else {
				int temp = input[middle];
				input[middle] = input[high];
				input[high] = temp;
				high--;
			}
		}

		return input;

	}

	
	public int[] sortDescendingOrder(int[] input) {
		int high = 0, middle = input.length - 1, low = input.length - 1;

		while (middle <= high) {
			if (input[middle] == 0) {
				int temp = input[middle];
				input[middle] = input[low];
				input[low] = temp;
				middle++;
				low++;
			} else if (input[middle] == 1) {
				middle++;
			} else {
				int temp = input[middle];
				input[middle] = input[high];
				input[high] = temp;
				high--;
			}
		}

		return input;

	}
}
