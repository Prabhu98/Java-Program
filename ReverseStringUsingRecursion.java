package Day04Dec2022;

import org.junit.Test;

public class ReverseStringUsingRecursion {
	
	
	@Test
	public void td1() {
	  char[] s  = {'h','e','l','l','o'};
	  reverseString(s);
	  System.out.println(s);
	}
	
	
	int end = 0;
   
    public void reverseString(char[] s) {
        end = s.length-1;
        reverseRecursive(s, 0,end);
    }
    
    public void reverseRecursive(char[] s, int start, int end) {
        if(start >= end) return;
        
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        
        reverseRecursive(s, start+1,end-1);
        
    }

}
