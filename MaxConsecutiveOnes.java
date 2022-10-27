import org.junit.Test;

public class MaxConsecutiveOnes {
	
	@Test
	public void tc1() {
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		int longestOnes = longestOnesBrute(nums,k);
		System.out.println(longestOnes);
	}
	
	@Test
	public void tc2() {
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		int longestOnes = longestOnesBrute(nums,k);
		System.out.println(longestOnes);
	}
	
	/**
	 *  Two pointer approach
	 *  initialize start =0 ,end =0,zeros =0 and maxcount=0
	 *  traversal while loop  from end to nums.length
	 *  if condition nums[end] == 0
	 *  then zeros incremented by 1
	 *  end incremented by 1
	 *  traversal while loop if(zeros > k)
	 *  if nums[start] == 0
	 *  zeros decrement by 1
	 *  start incremented by 1
	 *  Return the max count as Math.max(maxcount,end-start);
	 *  
	 * @param nums
	 * @param k
	 * @return
	 */
	
	
	 public int longestOnes(int[] nums, int k) {
	        if (nums == null) {
	            throw new IllegalArgumentException("Input array is null");
	        }

	        int start = 0;
	        int end = 0;
	        int zeros = 0;
	        int maxCount = 0;

	        while (end < nums.length) {
	            if (nums[end] == 0) {
	                zeros++;
	            }
	            end++;
	            while (zeros > k) {
	                if (nums[start] == 0) {
	                    zeros--;
	                }
	                start++;
	            }
	            maxCount = Math.max(maxCount, end - start);
	        }

	        return maxCount;
	    }
	 
	 //bruteforce
	 public int longestOnesBrute(int[] nums, int k) {
		 
		    
	        
	        int zeros1 = 0;
	        int maxCount1 = 0;
	        int start=0;
	        
	        for(int end=0;end< nums.length;end++) {
	        	if(nums[end] == 0) {
	        		zeros1++;
	        	}
	        	
	        	while(zeros1 > k) {
	        		if (nums[start] == 0) {
	                    zeros1--;
	                }
	        	}
	        	
	        	maxCount1 = Math.max(maxCount1, end - start);
	        }
	        
	        
	        
	        return maxCount1;
	    }
}
