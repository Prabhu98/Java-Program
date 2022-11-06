package Day05Nov2022;

import org.junit.Test;

public class FirstUniqueCharacter {

	@Test
	public void td1() {
		String s = "leetcode";
		int firstUniqChar = firstUniqChar1(s);
		System.out.println(firstUniqChar);
	}

	@Test
	public void td2() {
		String s = "loveleetcode";
		int firstUniqChar = firstUniqChar1(s);
		System.out.println(firstUniqChar);
	}

	@Test
	public void td3() {
		String s = "aabb";
		int firstUniqChar = firstUniqChar1(s);
		System.out.println(firstUniqChar);
	}

	/**
	 * 
	 * initialize min =Integer.MAX_VALUE; Convert to string to chararray Iterate
	 * from 0 to last check if character matches return index then return -1
	 * 
	 * 
	 * 
	 * 
	 * @param s
	 * @return
	 */

	public int firstUniqChar(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
				return i;
			}
		}

		return -1;

	}

	public int firstUniqChar1(String s) {

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (s.indexOf(c) == s.lastIndexOf(c)) {
				return i;
			}

		}

		return -1;

	}
}
