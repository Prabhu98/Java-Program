package Day06Nov2022;

import java.util.Arrays;

import org.junit.Test;

public class DuplicateZeros {
	
	@Test
	public void td1() {
		int[] arr = {1,0,2,3,0,4,5,0};
		int[] duplicateZeros = duplicateZeros(arr);
		System.out.println(Arrays.toString(duplicateZeros));
	}
	
	
	/**
	 * 
	 * iterate for 0 to arr.length
	 *  check condition if arr[i] ==0
	 *  then iterate from for arr.length to 0
	 *  add 0 change the occurance other position
	 *  incremented by 1
	 *  
	 * 
	 * @param arr
	 */

	public int[] duplicateZeros(int[] arr) {
		
		
		int size = arr.length;
        for(int i=0;i<size-1;i++){
            	if(arr[i]==0) {
            		
            		for(int j=size-2;j>=i;j--) {
            		    arr[j+1] =arr[j];
            	}
            		i++;
            	}
            }
		return arr;
        }
        
    }
	

