package Day31Oct;

import java.util.HashMap;

import org.junit.Test;

/**
 * 
 * 
 * Given an array of integers nums, return the number of good pairs.
 * 
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * 
 * 
 * @author prabhu A
 *
 */

public class NumbersofGoodPairs {

	@Test
	public void tc1() {
		int[] nums = { 1, 2, 3, 1, 1, 3 };
		int numIdenticalPairs = hashingConcepts(nums);
		System.out.println(numIdenticalPairs);

	}

	@Test
	public void tc2() {
		int[] nums = { 1, 1, 1, 1 };
		int numIdenticalPairs = numIdenticalPairs(nums);
		System.out.println(numIdenticalPairs);

	}

	public int numIdenticalPairs(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (i < j && nums[i] == nums[j]) {
					count++;
				}
			}
		}

		return count;

	}
	
	public int hashingConcepts(int[] nums) {
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		int count=0;
		
		for(int i=0;i<nums.length;i++) {  //0,1-1,2-2-3,
			if(hmap.containsKey(nums[i])) {
				count += hmap.get(nums[i]);
				hmap.put(nums[i], hmap.get(nums[i])+1);
			}
			else {
				
				hmap.put(nums[i], 1);
			}
		}
		
		
        return count;
	}

}
