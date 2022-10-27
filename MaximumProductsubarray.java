import org.junit.Test;

public class MaximumProductsubarray {
	
	
	@Test
	public void td1() {
		int[] nums = {3,-1,4};
		int maxProduct = maxProduct(nums);
		System.out.println(maxProduct);
	}
	
	
	@Test
	public void td2() {
		int[] nums = {3,0,4};
		int maxProduct = maxProduct(nums);
		System.out.println(maxProduct);
	}
	
	

	@Test
	public void td3() {
		int[] nums = {-3,-1,-2};
		int maxProduct = maxProduct(nums);
		System.out.println(maxProduct);
	}
	
	/**
	 * Initialize max value and product=1
	 * traversal for loop 0 to length
	 * product *= nums[i]
	 * find the max value
	 * check condition nums[i] ==0
	 * then reset product =1
	 * return max value
	 * @param nums
	 * @return
	 */
	
	
	   public int maxProduct(int[] nums) {
	        
		   int max = Integer.MIN_VALUE;
		   
		   int product =1;
		   
		   for(int i=0;i<nums.length;i++) {
			   product *= nums[i];
			   max = Math.max(product, max);
			   if(product == 0) {
				   product =1;
			   }
		   }
		   return max;
	    }
}

