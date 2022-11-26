package Day24Nov2022;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ThirdmaximumNumber {
	
	@Test
	public void td1() {
		int[] nums = {3,2,1};
		int thirdMax = thirdMax(nums);
		System.out.println(thirdMax);
	}
	
	
	
	
	   public int thirdMax(int[] nums) {
	        Set<Integer> hs= new HashSet<>();
	        for (int num : nums) {
	            hs.add(num);
	        }
	        if (hs.size() >= 3) {
	            hs.remove(Collections.max(hs));
	            hs.remove(Collections.max(hs));
	        }
	        return Collections.max(hs);
	        
	    }

}
