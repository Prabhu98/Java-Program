package TestLeafJavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TwoSumConcept {
   
	
	@Test
	public static void postive() {
		int[] nums = {1,6,8,2};
		int[] twoIndices = twoPointerList(nums,14);
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
	//brute force
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
	
	//two pointer 
	public static int[] twoPointer(int[] nums, int target) {
		
		int start =0,sum=0,end=nums.length-1;
		
		while(start < end) {
			sum = nums[start] + nums[end];
			if(sum == target) {
				nums[0] = start;
				nums[1] = end;
				break;
			}
			else if(sum < target) {
				start++;
			}else {
				end--;
			}
		}
		
		
		return new int[] {nums[0],nums[1]};
		
	}
	
	//list
public static int[] twoPointerList(int[] nums, int target) {
	
	List<Integer> lst = new ArrayList<Integer>();
	
	for (Integer n : nums) {
		lst.add(n);
	}
	
	for(int i=0;i<lst.size();i++) {
		for(int j=1;j<lst.size();j++) {
			if(lst.get(i) +lst.get(j) == target) {
				return new int[] {i,j};
			}
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
	
	/*
	 * HashMap<Integer,Integer> hmap = new HashMap<>();
	 * 
	 * for(int i=0;i<nums.length;i++){ int comp = target-nums[i];
	 * 
	 * if(hmap.containsKey(comp)){ return new int[] {hmap.get(comp),i}; }
	 * 
	 * hmap.put(nums[i],i); }
	 * 
	 * return null;
	 * 
	 * }
	 */

}
