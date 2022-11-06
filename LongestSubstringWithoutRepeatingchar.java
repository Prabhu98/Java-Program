package Day05Nov2022;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingchar {

	/**
	 * Example 1:
	 * 
	 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
	 * length of 3. Example 2:
	 * 
	 * Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length
	 * of 1. Example 3:
	 * 
	 * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the
	 * length of 3. Notice that the answer must be a substring, "pwke" is a
	 * subsequence and not a substring.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void td1() {
		String s = "abcabcbb";
		int longestSubstring = isLongestSubstring(s);
		System.out.println(longestSubstring);
	}
	
	@Test
	public void td2() {
		String s = "bbbb";
		int longestSubstring = isLongestSubstring(s);
		System.out.println(longestSubstring);
	}
	
	
	@Test
	public void td3() {
		String s = "PWWKEW";
		int longestSubstring = isLongestSubstring(s);
		System.out.println(longestSubstring);
	}

	/**
	 * Initialize i=0,j=0 ,max =Integer.MIN_VALUE , currentLength=0 iterate from 0
	 * to length Initialize Hashset check char in hashset then add in hashset if its
	 * duplicates then find the currentlength and break the loop incremented i by 1
	 * return max
	 * 
	 * @param s
	 * @return
	 */

	public int isLongestSubstring(String s) {

		/*
		 * int i = 0, j = 0, max = Integer.MIN_VALUE, currentlength = 1;
		 * 
		 * HashSet<Character> hset = new HashSet<Character>();
		 * 
		 * while (i < s.length() && j < s.length()) {
		 * 
		 * char c = s.charAt(i);
		 * 
		 * while (!hset.contains(c)) { hset.add(c); currentlength += i - j; i++; } i++;
		 * j++;
		 * 
		 * max = Math.max(max, currentlength); }
		 * 
		 * return max;
		 */

		Set<Character> hset = new HashSet<Character>();

		int start = 0, end = 0, currentMax = 0, max = 0;

		while (end < s.length()) {

			if (hset.contains(s.charAt(end))) {
				currentMax = end - start;
				hset.remove(s.charAt(start));
				start++;

			} else {
				hset.add(s.charAt(end));// a //ab //abc
				currentMax = hset.size();
				end++;
			}
			max = Math.max(max, currentMax);

		}
		return max;
	}

}
