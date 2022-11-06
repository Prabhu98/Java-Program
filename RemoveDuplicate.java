package Day06Nov2022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class RemoveDuplicate {

	@Test
	public void td1() {
		int[] arr = { 1, 2, 3, 4, 1, 2, 3, 2, 1 };
		removeduplicate(arr);
	}

	public void removeduplicate(int[] arr) {
		
		Set<Integer> hset = new HashSet<Integer>();
		
		List<Integer> lst = new ArrayList<>();
		
		for (Integer i : arr) {
	         if(!hset.contains(i) && !lst.contains(i)) {
	        	 lst.add(i);
	        	 hset.add(i);
	         }else {
	        	 hset.remove(i);
	         }
        }
		System.out.println(hset);
	  
	
	
	}
}
