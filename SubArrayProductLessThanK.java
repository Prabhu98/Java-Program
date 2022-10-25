import org.junit.Test;

public class SubArrayProductLessThanK {
	
	//Two pointer Shrink and grow
	
	
	@Test
	public void example1() {
		int[] nums = {10,5,2,6};
		int target =100;
		int minSubArrayLen = numSubarrayProductLessThanK(nums ,target);
		System.out.println(minSubArrayLen);
				
	}
	
	@Test
	public void example2() {
		int[] nums = {1,2,3};
		int target =0;
		int minSubArrayLen = numSubarrayProductLessThanK(nums ,target);
		System.out.println(minSubArrayLen);
				
	}
	
	@Test
	public void example3() {
		int[] nums = {};
		int target =100;
		int minSubArrayLen = numSubarrayProductLessThanK(nums ,target);
		System.out.println(minSubArrayLen);
				
	}
	 public int numSubarrayProductLessThanK(int[] nums, int k) {
		if(k <=1)return 0;
		
		int i=0,j=0,count=0,product=1;
		
		while(i < nums.length) {
			
			product *= nums[i];
			
			 while(product >=k) {
				 product /= nums[j];
				 j++;
			 }
			
			count += i-j+1;
			i++;
		}
		
		 
		return count;
	        
	   }

}
