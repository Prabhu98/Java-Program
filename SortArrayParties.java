package TestLeafJavaProgram;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayParties {
	
	
	@Test
	public static void postive() {
		int[] nums = {4,2,5,7};
		int[] sortArrayByParity1 = sortArrayByParitySwap(nums);
		System.out.println(Arrays.toString(sortArrayByParity1));	
		
	}
	
	@Test
	public static void negative() {
		int[] nums = {};
		int[] sortArrayByParity2 = sortArrayByParitySwap(nums);
		System.out.println(Arrays.toString(sortArrayByParity2));	
		
	}
	
	@Test
	public static void edge() {
		int[] nums = {3,2};
		int[] sortArrayByParity3 = sortArrayByParitySwap(nums);
		System.out.println(Arrays.toString(sortArrayByParity3));	
		
	}
	
	/*
	 * Intialize  even = 0 , odd =1
	 * create a new length array
	 * traversal for loop from 0 to length()-1
	 * check condition as if index as even and nums as even
	 * then add it new length array
	 * even as increment by 2
	 * check condition as if index as even and nums as odd
	 * then add it new length array
	 * even as increment by 2
	 * check condition  if index as odd and nums as even
	 * even as increment by 2
	 * the odd as increment by 2
	 * 
	 *
	 */
	
   public int[] sortArrayByParityII(int[] nums) {
        
        int even=0;
        int odd =1;
        int arr[]= new int[nums.length];
                for (int i = 0; i < nums.length; i++) {
                    if(nums[i]%2==0) {
              arr[even++]=nums[i];
              even=even+1;
                    }
                }
                for (int i = 0; i < nums.length; i++) {
                    if(nums[i]%2!=0) {
                          arr[odd++]=nums[i];
                         odd=odd+1;
                                
                                }
                }
                return arr;
        
    }
   
 //swap
 	public static int[] sortArrayByParitySwap(int[] A) {
 		
 		
 		//int[] newarr1 = new int[nums.length];
 		final int n = A.length;
 		
 		for (int i = 0, j = 1; i < n; i += 2, j += 2) {
 		      while (i < n && A[i] % 2 == 0)
 		        i += 2;
 		      while (j < n && A[j] % 2 == 1)
 		        j += 2;
 		      if (i < n) {
 		        int temp = A[i];
 		        A[i] = A[j];
 		        A[j] = temp;
 		      }
 		    }
					
 			return A;
 	
   }
	
	public static int[] sortArrayByParity(int[] nums) {
		
		int even =0;
		int odd =1;
		
		int[] newarr = new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			
			if(i%2 ==0 && nums[i]%2 == 0) {
				newarr[even] = nums[i];
				even+=2;		
			}else if(i%2 ==0 && nums[i]%2!= 1) {
				newarr[odd] = nums[i];
				odd+=2;
			}else if(i%2==1 && nums[i]%2==0) {
				newarr[even] = nums[i];
				even+=2;
			}else {
				newarr[odd] = nums[i];
				odd+=2;
			}
			
		}
		return newarr;
		
	}
	
	
	

	
	
	public static void main(String[] args) {
		
		postive();
		negative();
		edge();
	}

}
