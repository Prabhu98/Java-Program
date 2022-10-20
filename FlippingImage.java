package Day4;

import java.util.Arrays;

import org.junit.Test;

public class FlippingImage {
	
	
	@Test
	public static void postive() {
			int[][] str = {{1,1,0},{1,0,1},{0,0,0}};
			int[][] filpconvertImage = flipAndInvertImage(str);
			System.out.println(Arrays.toString(filpconvertImage));
	}
	
	
	 public static int[][] flipAndInvertImage(int[][] image) {
		  
		 int len = image.length;
		 
		 int[][] resultarr = new int[len][len];
		 
		 //int row =0, col=0;
		 
		 for(int i=0;i<len;i++) {
			 int k = image[i].length-1;
			 for(int j=0;j<image[i].length;j++) {
                
				 resultarr[i][j] = image[i][k];
				 k--;
		 }
			 for(int j=0;j<image[i].length;j++) {
				 
				 if(resultarr[i][j] == 0) {
					 resultarr[i][j] = 1;
				 }else {
					 resultarr[i][j] = 0;
				 }
			 }
			 
		 }
		return resultarr;
		 
}
		 
		
	        
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postive();
	}

}
