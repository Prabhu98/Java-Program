package TestLeafJavaProgram;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumConcept {
   
	
	@Test
	public static void postive() {
		int[] nums = {2,7,11,15};
		int[] twoIndices = twoSum(nums,9);
		System.out.println(Arrays.toString(twoIndices));	
		
	}
	
	@Test
	public static void negative() {
		int[] nums = {};
		int[] twoIndices = twoSum(nums,0);
		System.out.println(Arrays.toString(twoIndices));		
		
	}
	
	@Test
	public static void edge() {
		int[] nums = {2,1,2};
		int[] twoIndices = twoSum(nums,6);
		System.out.println(Arrays.toString(twoIndices));	
		
	}
	
	
	
	/**
	 * Traversal loop to 0 to endIndex -1
	 * Check condition adding each element to next item equals to the target
	 * then return the index of i,j
	 * if target not matches and return the null int.
	 * 
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	
	public static int[] twoSum(int[] nums, int target) {
		
		for(int i=0,j=1;i<nums.length;i++,j++) {
			if(nums[i] +nums[j] == target) {
				return new int[] {i,j};
			}else {
				return new int[] {};
			}
		}
		
		return new int[] {};
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postive();
		negative();
		edge();
	}

}
