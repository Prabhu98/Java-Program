package Day11Nov2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class SumOfUniqueElement {

	@Test
	public void td1() {
		int[] nums = { 1, 1, 1 };
		int sumOfUnique = sumOfUnique(nums);
		System.out.println((sumOfUnique));
	}

	public int sumOfUnique(int[] nums) {
		int sum =0;
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for(int i=0;i<nums.length;i++) {
			hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
		}

		for (Entry<Integer, Integer> res : hmap.entrySet()) {
			
			if(res.getValue() <=1) {
				sum += res.getKey();
			}
		}
		return sum;

	}
}
