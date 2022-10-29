import java.util.Arrays;

import org.junit.Test;

public class threeSum {
	
	
	
	@Test
	public void tc1() {
		
		int[] nums = {1,2,3,5};
		int target = 6;
		int[] threePointer = threePointer(nums,target);
		System.out.println(Arrays.toString(threePointer));
		
	}

	public static int[] threePointer(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
				if(nums[i] +nums[j] +nums[k]==target) {
					return new int[] {i,j,k};
				}else {
					return new int[] {};
				}
			}
		}
		}
		
		
		
		return new int[] {};
		
	}
}
