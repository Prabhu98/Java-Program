package Day31Oct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

/**
 * 
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings s and t are isomorphic if the characters in s can be replaced to
 * get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character, but a character may map to itself.
 * 
 * 
 * 
 * 
 * 
 * 
 * @author prabhu A
 *
 */

 

public class IsomorphicString {
	
	
	 @Test
	  public void tc1() {
		String s ="egg";
		String t ="add";
		System.out.println(isIsomorphic(s,t));

	   }
	 
	 

	 @Test
	  public void tc2() {
		String s ="foo";
		String t ="bar";
		System.out.println(isIsomorphic(s,t));

	   }
	 

	 @Test
	  public void tc3() {
		String s ="paper";
		String t ="title";
		System.out.println(isIsomorphic(s,t));

	   }

	public boolean isIsomorphicAscII(String s, String t) {

		if (s.length() != t.length())
			return false;

		int[] s1 = new int[26];
		int[] s2 = new int[26];

		for (int i = 0; i < s.length(); i++) {
			s1[s.charAt(i) - 'a']++;
			s2[t.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s1[s.charAt(i) - 'a'] != s2[t.charAt(i) - 'a']) {
				return false;
			}
		}

		return true;

	}
	
	public boolean check(String s, String t) {

		if (s.length() != t.length())
			return false;
	    
        
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
                
            }
            hm.put(s.charAt(i),t.charAt(i));
        }
        return true;
	}
	
	 public boolean isIsomorphic(String s, String t) {
	        return check(s,t) && check(t,s);
	    }

}
