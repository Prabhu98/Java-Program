package Day2;

import java.util.Arrays;

import org.junit.Test;

public class AssignCookies {
	@Test
	public static void postive() {
			int[] g = {1,2,3};
			int[] s = {1,1};
			int findContentChildren = findContentChildren(g,s);
			System.out.println(findContentChildren);
	}
	
	@Test
	public static void negative() {
			int[] g = {};
			int[] s = {1};
			int findContentChildren = findContentChildren(g,s);
			System.out.println(findContentChildren);
	}
	
	@Test
	public static void edge() {
			int[] g = {1,2,3};
			int[] s = {1,2,3};
			int findContentChildren = findContentChildren(g,s);
			System.out.println(findContentChildren);
	}
	
	/**
	 * Using Array.sort for greed factor of children as g and cookies as s
	 * Initialize  g_pointer = 0 and s_pointer =0
	 * using while loop traversal length
	 * check condition as greed factor is less than or equal to cookies
	 * then g_pointer and s_pointer incremented by 1.
	 * if not matching s_pointer incremented by 1
	 * return the a_pointer
	 * 
	 * 
	 * @param g
	 * @param s
	 * @return
	 */
	
	
    public static int findContentChildren(int[] g, int[] s) {
    	
    	Arrays.sort(g);
    	Arrays.sort(s);
    	
    	int g_pointer = 0;
    	
    	int s_pointer = 0;
    	
    	while(g_pointer < g.length && s_pointer < s.length) {
    		
    		if(g[g_pointer] <= s[s_pointer]) {
    			g_pointer++;
    			s_pointer++;
    		}
    		else {
    			s_pointer++;
    		}
    	}
    	
    	
		return g_pointer;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postive();
		negative();
		edge();
	}

}
