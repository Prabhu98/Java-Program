package Day5;

import org.junit.Test;

public class ReversePrefixWord {
	
	@Test	
	public void example1() {
		String word ="abcdefd";
		char ch = 'd';
		String reversePrefix = reversePrefix(word,ch);
		System.out.println(reversePrefix);
	}
	
	
	
	 public String reversePrefix(String word, char ch) {
		 
		 int len = word.length();
		 
		 char[] c = word.toCharArray();
		 
		 int start =0;
		 int i =0;
		 
		 
	       for(i=0;i<len;i++) {
			 
			 if(c[i] == ch) {
				 break;
			 }		 
			
		 }
	       if(i == c.length) {
	    	   return word;
	       }
		   
	       while(start < i) {
	    	   char ch1 = c[start];
	    	   c[start] = c[i];
	    	   c[i] = ch1;
	    	   start++;
	    	   i--;
	    	   
	       }
		 
		 
		return new String(c);
	        
	 }

}
