package Day2;

import org.junit.Test;

public class CheckDoubleExist {
	
	@Test
	public static void postive() {
			int[] arr = {7,1,14,11};
			boolean checkIfExist = checkIfExist(arr);
			System.out.println(checkIfExist);
	}
	

	@Test
	public static void negative() {
			int[] arr = {10};
			boolean checkIfExist = checkIfExist(arr);
			System.out.println(checkIfExist);
	}

	
	@Test
	public static void edge() {
			int[] arr = {3,1,7,11};
			boolean checkIfExist = checkIfExist(arr);
			System.out.println(checkIfExist);
	}
	
	/**
	 * 
	 * 
	 * traversal for loop iterate i as 0 to length
	 * traversal for loop iterate j=i+1 to length
	 * result = 2 * arr[j];
	 * check result equal to arr[i];
	 * else
	 * result = 2 * arr[i];
	 * check result equal to arr[j];
	 *
	 * 
	 * 
	 * 
	 */

	public static boolean checkIfExist(int[] arr) {

	        int len = arr.length;
	        
	        for(int i=0;i<len;i++){
	            
	            for(int j=i+1;j<len;j++){
	                
	                int result = 2 * arr[j];
	                if (result == arr[i]){
	                    return true;
	                }else {
	                 result = 2 * arr[i];
	                   if (result == arr[j]){
	                    return true;
	                }
	            }
	          
	            
	        }
	        
	    }
	          return false;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       postive();
       negative();
       edge();
	}

}
