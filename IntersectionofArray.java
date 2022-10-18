package Day1;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class IntersectionofArray {
	
	@Test
	public static void postive() {
		int[] nums = {1,2,2,1,4};
		int[] nums1 = {2,2,4};
		int[] sortArrayByParity1 = intersection(nums,nums1);
		System.out.println(Arrays.toString(sortArrayByParity1));	
		
	}
	
	@Test
	public static void negative() {
		int[] nums = {1,2,2,1};
		int[] nums1 = {2,2};
		int[] sortArrayByParity1 = intersection(nums,nums1);
		System.out.println(Arrays.toString(sortArrayByParity1));	
		
	}
	
	@Test
	public static void edge() {
		int[] nums = {1,2,2,1};
		int[] nums1 = {2,2};
		int[] sortArrayByParity1 = intersection(nums,nums1);
		System.out.println(Arrays.toString(sortArrayByParity1));	
		
	}
	
	 public static int[] intersection(int[] nums1, int[] nums2) {
		
		 int len1 = nums1.length;
	        int len2 = nums2.length;
	        int[] arr = new int[nums1.length];
	        int k = 0;
	        
	        HashSet<Integer> hSet = new HashSet<>();
	        
	        for(int i = 0; i < len1; i++){
	            if(!hSet.contains(nums1[i]))
	                hSet.add(nums1[i]);
	        }
	        
	        for(int j = 0; j < len2; j++){
	            if(hSet.contains(nums2[j])){
	                hSet.remove(nums2[j]);
	                arr[k++] = nums2[j];
	            }
	        }
	        
	        return Arrays.copyOf(arr, k);		
		 
		 
	 }
	        
	    
	public static void main(String[] args) {
		
		postive();
		
		

	}

}
