package Day11Nov2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class PertOfString {

	@Test
	public void td1() {
		String s1 = "ab", s2 = "eidboaoo";
		boolean checkInclusion = checkInclusionIII(s1, s2);
		System.out.println(checkInclusion);
	}

	public boolean checkInclusion(String s1, String s2) {

		Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();

		Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			hmap1.put(s1.charAt(i), hmap1.getOrDefault(s1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < s2.length() - s1.length(); i++) {
			for (int j = i; j < s1.length() + i; j++) {
				hmap2.put(s2.charAt(j), hmap2.getOrDefault(s2.charAt(j), 0) + 1);
			}
			if (hmap1.equals(hmap2))
				return true;
			else {
				hmap2.clear();
			}
		}

		return false;

	}

	public boolean checkInclusionII(String s1, String s2) {

		Map<Character, Integer> S1 = new HashMap<>(), S2 = new HashMap<>();

		for (char c : s1.toCharArray())
			S1.put(c, S1.getOrDefault(c, 0) + 1);

		int left = 0, right = 0;

		while (right < s2.length()) {

			int len = right - left + 1;
			S2.put(s2.charAt(right), S2.getOrDefault(s2.charAt(right), 0) + 1);
			if (len < s1.length()) {
				right++;
				continue;
			}
			if (len == s1.length()) {
				char end = s2.charAt(left);

				if (S1.equals(S2))
					return true;
				else {
					S2.put(end, S2.get(end) - 1);
					if (S2.get(end) == 0)
						S2.remove(end);
				}

				left++;
				right++;
			}

		}

		return false;
	}

	public boolean checkInclusionIII(String s1, String s2) {

		Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();

		Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			hmap1.put(s1.charAt(i), hmap1.getOrDefault(s1.charAt(i), 0) + 1);
		}

		int start = 0, end = 0;
		while (end < s2.length()) {
			hmap2.put(s1.charAt(end), hmap2.getOrDefault(s1.charAt(end), 0) + 1);
			end++;
			if (s1.length() == end - start) {
				if (hmap2.equals(hmap1))
					return true;
				if (hmap2.get(s2.charAt(start)) > 1)
					hmap2.put(s1.charAt(start), hmap2.getOrDefault(s1.charAt(start), 0) - 1);
				else
					hmap2.remove(s2.charAt(start));
				start++;
			}
		}

		return false;

	}

}
