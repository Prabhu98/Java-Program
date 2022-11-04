package Day31Oct;

import java.util.HashSet;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacter {

	@Test
	public void td1() {
		String s = "PWWKEW";
		int longestSubstring = isLongestSubstring(s);
		System.out.println(longestSubstring);
	}

	public int isLongestSubstring(String s) {

		int i = 0, j = 0, max = Integer.MIN_VALUE, currentlength = 0;

		HashSet<Character> hset = new HashSet<Character>();

		while (i < s.length()) {
			 char c = s.charAt(i);
			 
			 while(hset.contains(c)) {
				 hset.remove(s.charAt(j));
				 j++;
			 }
			 hset.add(c);
			 currentlength = i-j+1;
			 i++;
			 max = Math.max(max, currentlength);
		}
			 
	return max;

	}

}
