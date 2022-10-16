package TestLeafJavaProgram;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class RemoveElement {
	
	@Test
	public static void postive() {
		int[] nums = {3,2,2,3,5,6};
		int removeElement = removeElement(nums,3);
		System.out.println(removeElement);	
		
	}
	
	@Test
	public static void negative() {
		int[] nums = {};
		int removeElement = removeElement(nums,0);
		System.out.println(removeElement);		
		
	}
	
	@Test
	public static void edge() {
		int[] nums = {2,2};
		int removeElement = removeElement(nums,2);
		System.out.println(removeElement);	
		
	}
	
	
	/*
	*  Assign length = 0
	*  created a new length array
	 * traversal for loop from 0 to length-1
	 * check condition index is equal to val
	 * if condition as true and iterate i by 1
	 * check condition index is not equal to val
	 * assign the value to the new length array
	 * return the size the length
	 * 
	 * 
	 */
	
     public static int removeElement(int[] nums, int val) {
    	 
    	  	 
    	 int length=0;
    	 
    	 int[] newarr = new int[nums.length];
    	 
    	 for(int i=0;i<nums.length;i++) {
    		 
    		 if(nums[i] != val) {
    			 newarr[length] = nums[i];
    			 length++;    			 
    		 }
    		 
    	 }
    	 
		 return length;
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postive();
		negative();
		edge();

	}

}
