package Day11Nov2022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MaximumNumberOfWordsYouCanType {

	@Test
	public void td1() {
		String text = "hello world", brokenLetters = "ad";
		int canBeTypedWords = canBeTypedWords(text, brokenLetters);
		System.out.println(canBeTypedWords);
	}

	public int canBeTypedWords(String text, String brokenLetters) {
		int count = 0;
		String[] word = text.split("\\s+");

		Set<Character> set = new HashSet<>();

		for (int i = 0; i < brokenLetters.length(); i++) {
			set.add(brokenLetters.charAt(i));
		}

		for (int j = 0; j < word.length; j++) {
			String s = word[j];
			int i = 0;
			for (i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (set.contains(c))
					break;
			}
			if (i == s.length())
				count++;
		}

		return count;

	}
}
