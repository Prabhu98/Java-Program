package Day11;

import java.util.Arrays;

import org.junit.Test;

public class ConcatenationArray {
	
	
	
	@Test
	public void td6() {
		int[] input = { 1, 5, 2, 3, 7, 1 };
		int[] concatenation = getConcatenation(input);
		System.out.println(Arrays.toString(concatenation));
	}
	
	
	
	
	 public int[] getConcatenation(int[] nums) {
	        
	        int[] result = new int[nums.length*2];
	        
	        int start = 0;
	        for(int i=0 ;i<nums.length;i++){
	            result[start] = nums[i];
	            start++;    
	        }
	        return result;
	    }

}
