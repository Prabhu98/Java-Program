package Day5;

import org.junit.Test;

public class ReverseVowels {
	 
	@Test
	public static void postive() {
		String s ="hello";
		String revvowels = reverseVowels(s);
		System.out.println(revvowels);
	}
	
	
	private static boolean isvowel(char c) {
		if ( c == 'a' || c =='A' || c=='e'|| c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
	    return true;
		
		return false;
		
	}
    
	
	
	public static String reverseVowels(String s) {
    	int end = s.length()-1;
    	
    	int start =0;
    	
    	char[] c = s.toCharArray();
    	
    	while (start < end) {
    		
    		if(!isvowel(c[start])) {
    			start++;
    			continue;
    		}
    		
    		if(!isvowel(c[end])) {
    			end--;
    			continue;
    		}
    		char d = c[start];
    		c[start] = c[end];
    		c[end] = d;
    		start++;
    		end--;
    	}
    	
    	return String.valueOf(c);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       postive();
	}

}
