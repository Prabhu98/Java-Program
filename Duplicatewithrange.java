package Day18Nov2022;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class Duplicatewithrange {

	@Test
	public void td1() {
		int[] nums = { 5, 6, 8, 2, 4, 6, 9 };
		int k = 4;
		boolean hasDuplicate = hasDuplicate(nums, k);
		System.out.println(hasDuplicate);
	}

	public boolean hasDuplicate(int[] nums, int k) {

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (hmap.containsKey(nums[i])) {
				
				Integer i2 = hmap.get(nums[i]);

				if (i - i2 <= k) {
					return true;
				}

			}
			hmap.put(nums[i], i);

		}
		return false;

	}
}
