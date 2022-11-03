package Day02Nov2022;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class MajorityElement {
	
	 @Test
	 public void td1() {
		 int[] nums = {2,2,3,4};
		 int majorityElement = majorityElementBrute(nums);
		 System.out.println(majorityElement);
		 
	 }
	
	
	
	
	
	 public int majorityElement(int[] nums) {
		 
		 HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		 int result =nums.length / 2;
		 for(int i=0;i<nums.length;i++) {
		   if(hmap.containsKey(nums[i])) {
			 hmap.put(nums[i], hmap.get(nums[i]) +1);			 
		 }else {
			 hmap.put(nums[i], 1);
		  }
		 }
		 
		 for (Integer i : hmap.keySet()) {
	            if (hmap.get(i) > result) {
	                return i;
	            }
	     }
		 
		return 0;
	        
	
	 }
	 
public int majorityElementBrute(int[] nums) {
		 
	 int count = 0;
     int ans = 0;
     
     for(int num:nums) {
         if(count == 0) {
             ans = num;//3
         }
         if(num == ans) {
             count++;
         } else {
             count--;
         }
     }
     
     return ans;
	        
	
	 }
}
