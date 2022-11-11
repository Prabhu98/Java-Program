package Day11Nov2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class PertOfString {

	@Test
	public void td1() {
		String s1 = "ab", s2 = "eidboaoo";
		boolean checkInclusion = checkInclusion(s1, s2);
		System.out.println(checkInclusion);
	}

	public boolean checkInclusion(String s1, String s2) {

		Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();

		Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			hmap1.put(s1.charAt(i), hmap1.getOrDefault(s1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < s2.length()-2; i++) {
			for (int j = i; j < s1.length()+i; j++) {
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

}
