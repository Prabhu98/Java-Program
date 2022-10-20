package Day4;

import org.junit.Test;

public class ArithmeticTriplets {
	
	@Test
	public static void postive() {
		
		int[] nums = {0,1,4,6,7,10};
		int diff = 2;
		int arithmeticTriplets = arithmeticTriplets(nums,diff);
		System.out.println(arithmeticTriplets);
	}
	
	/**
	 * traversal for loop i,j=i+1,k=j+1
	 * 
	 * check condition as if(nums[j]-nums[i] == diff && nums[k]-nums[j]==diff
	 * increment count by 1
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param nums
	 * @param diff
	 * @return
	 */
	
	public static int arithmeticTriplets(int[] nums, int diff) {
		int count =0;
		
		for(int i =0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				
				for(int k=j+1;k<nums.length;k++)
				
				if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
				count++;     
			}
		}
			
		}
		return count;	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postive();
	}

}
