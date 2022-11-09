package Day09Nov2022;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubstringKdistinctCharacter {

	@Test
	public void td1() {

		String str = "abcbdbdbbdcdabd";
		int k = 2;
		int findLengthOfLongestSubstring = findLengthOfLongestSubstring(str, k);
		System.out.println(findLengthOfLongestSubstring);

	}

	/**
	 * Initialize start =0,end=0 and maxcount =-1( str is greater than K) Initialize
	 * HashMap Add char to the hashmap check condition if size is greater than k if
	 * char value is 1 then remove char else remove the value of the char increment
	 * start by 1 if hashmap count is equal to k then return maxcount
	 * 
	 * @param str
	 * @param k
	 * @return
	 */

	public int findLengthOfLongestSubstring(String str, int k) {

		int start = 0, maxCount = -1;

		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0) + 1);

			while (hmap.keySet().size() > k) {
				char removecha = str.charAt(start);

				if (hmap.get(removecha) == 1) {
					hmap.remove(removecha);
				} else {
					hmap.put(removecha, hmap.get(removecha) - 1);
				}
				start++;
			}
			

			if (hmap.keySet().size() == k) 
				maxCount = Math.max(maxCount, i - start + 1);
			
			
		}
		return maxCount;
		

	}

}
