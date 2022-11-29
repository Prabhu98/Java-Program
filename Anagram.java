package Day28Nov2022;

import java.util.Arrays;

import org.junit.Test;

public class Anagram {

	/*
	 * Sort the array s and t convert toCharArray iterate loop s and t compare both
	 * value
	 * 
	 * 
	 */

	@Test
	public void td1() {

		String s = "anagram", t = "nagaram";
		boolean anagram = isAnagramIII(s, t);
		System.out.println(anagram);
	}

	@Test
	public void td2() {

		String s = "rat", t = "car"; // art
		boolean anagram = isAnagramIII(s, t);
		System.out.println(anagram);
	}

	public boolean isAnagram(String s, String t) {

		char[] s1 = s.toCharArray();
		char[] s2 = t.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		for (int i = 0; i < s1.length; i++) {
			{
				if (s1[i] != s2[i]) {
					return false;
				}
			}
		}

		return true;

	}

	public boolean isAnagramII(String s, String t) {

		char[] s1 = s.toCharArray();
		char[] s2 = t.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		int start = 0;

		while (start < s1.length) {
			if (s1[start] != s2[start++]) {
				return false;

			}

		}

		return true;

	}

	public boolean isAnagramIII(String s, String t) {

		int[] s1 = new int[26];
		int[] s2 = new int[26];
		
		int start =0;
		
		while(start < s.length() || start < t.length()) {
			     char r1 = s.charAt(start);
			     char r2 = t.charAt(start);
			   s1[r1 - 'a']++;
			   s2[r2 -'a']++;
			   start++;
		}
		return Arrays.equals(s1, s2);
		

	}

}
