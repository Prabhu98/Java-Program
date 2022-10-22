package Day5;

import org.junit.Test;

public class SumOfConsecutive {
	
	
	
	@Test	
	public void example1() {
		int[] nums = {1,12,-5,-6,50,3};
		int k =4;
		double sumofConsecutive = sumofConsecutive(nums,k);
		System.out.println(sumofConsecutive);
	
	}
	
	
	public double sumofConsecutive(int[] nums, int k) {
		 double maxavg =0;
		
		 double sum = 0;
	        for(int i = 0; i < k; i++){
	          sum += nums[i];  
	        }
	        maxavg = sum / k;
	        
	        for(int i = k; i < nums.length; i++) {
	            sum += nums[i]-nums[i - k];
	            maxavg = Math.max(maxavg, sum/k); 
	        }
	        return maxavg ;
		
		
		
	}

}
