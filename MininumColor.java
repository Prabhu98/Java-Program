package Day5;

import org.junit.Test;

public class MininumColor {
	
	@Test	
	public void example1() {
	 String blocks = "WBBWWBBWBW";
	 int k = 7;
	 int minimumRecolors = minimumRecolors(blocks,k);
	 System.out.println(minimumRecolors);
	 
	 
	 
	}
	
	 public int minimumRecolors(String blocks, int k) {
		 int ans = 0;
	        int n = blocks.length();
	        for(int i = 0;i<k;i++){
	            if(blocks.charAt(i) == 'W') ans++;
	        }
	        int min = ans;
	        int l = 0, r = k;
	        while(r<n){
	            if(blocks.charAt(l) == 'W') ans--;
	            if(blocks.charAt(r) == 'W') ans++;
	            if(ans == 0) return 0;
	            min = Math.min(ans, min);
	            l++;
	            r++;
	        }
	        return min;
	    }
		 
	 }



