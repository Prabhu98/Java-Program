package TestLeafJavaProgram;

import java.util.Arrays;

import org.junit.Test;

public class SortArray {
	
	@Test
	public static void postive() {
		int[] nums = {3,1,2,4};
		int[] sortArrayByParity1 = sortArrayByParity(nums);
		System.out.println(Arrays.toString(sortArrayByParity1));	
		
	}
	
	@Test
	public static void negative() {
		int[] nums = {};
		int[] sortArrayByParity2 = sortArrayByParity(nums);
		System.out.println(Arrays.toString(sortArrayByParity2));	
		
	}
	
	@Test
	public static void edge() {
		int[] nums = {1,1,1,1};
		int[] sortArrayByParity3 = sortArrayByParity(nums);
		System.out.println(Arrays.toString(sortArrayByParity3));	
		
	}
	
	 public static int[] sortArrayByParity(int[] nums) {
		 
		 /**
		  *  created new length of array
		  *  assign start =0
		  *  traversal for loop check condition as even number
		  *  if even number , assign a value to the new array to the index 
		  *  increment the start variable
		  *  traversal for loop check condition as odd number
		  *  if odd number assign a value to the new array.
		  *  increment the start variable
		  *  print the new array.
		  * 
		  */
	                
	        int[] a = new int[nums.length];
	        
	        int start = 0;
	        
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] % 2 == 0){
	                a[start] = nums[i];
	                start++;
	            }
	        }
	        
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] % 2 == 1){
	                a[start] = nums[i];
	                start++;
	            }
	        }
	        return a;
	    }

	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   edge();
		
		
		
	
		
	}

	

}
