package Day15Nov2022;

import java.util.HashSet;

import org.junit.Test;

public class SubstringOfSizeThree {

	@Test
	public void td1() {
		String s = "xyzzaz";
		int countGoodSubstrings = countGoodSubstrings(s);
		System.out.println(countGoodSubstrings);
	}

	public int countGoodSubstrings(String s) {

		int count = 0;
		HashSet<Character> ch = new HashSet<Character>();

		for (int i = 0; i < s.length() - 2; i++) {
			ch.add(s.charAt(i));
			ch.add(s.charAt(i + 1));
			ch.add(s.charAt(i + 2));
			if (ch.size() == 3) {
				count++;
			}
			ch.clear();
		}
		return count;

	}

}
