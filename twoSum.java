package KadaneAndThreePointerAlogrithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

public class twoSum {
	
	@Test
	public  void negative() {
		int[] nums = {2,7,11,15};
		int target =26;
		int[] twoSum = twoSumValue(nums,target);
		System.out.println(Arrays.toString(twoSum));
	}
	
	public  int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	int sum = target -nums[i];
            if(map.containsKey(sum)) {
                return new int[]{map.get(sum), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
		 
	}
	
	public  int[] twoSumValue(int[] nums, int target) {
		HashSet<Integer> hset = new HashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			if(hset.contains(target-nums[i])) {
				return new int[] {target-nums[i],nums[i]};
			}else {
				hset.add(nums[i]);
			}
		}
		 
		return null;
	}
}


