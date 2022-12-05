package Day04Dec2022;

import org.junit.Test;

public class FindMissingKthPositiveNumber {
	
	
	@Test
	public void td1() {
		int[] arr = {2,3,4,7,11};
		
		int k=5;
		int findKthPositive = findKthPositive(arr,k);
		System.out.println(findKthPositive);
	}

	 public int findKthPositive(int[] arr, int k) {
		 
		    int num = 0, index = 0, count = 0;
		    while (count < k) {
		        num++;
		        
		       
		        if (index < arr.length && num == arr[index]) {
		            index++;
		        } else {
		            count++;
		        }
		    }
		    
		    return num;

	        
	  }
}
