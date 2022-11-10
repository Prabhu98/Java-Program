package Day10Nov2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class KeyboardRow {
	
	
	@Test
	public void td1() {
		String[] words = {"Hello","Alaska","Dad","Peace"};
		String[] findWords = findWords(words);
		System.out.println(Arrays.toString(findWords));
	}

	public String[] findWords(String[] words) {

		List<String> result = new ArrayList<>();
		String[] levels = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
		for (String word : words) {
			for (String level : levels) {
				int lettersCount = word.length();
				for (int k = 0; k < word.length(); k++) {
					char c = Character.toLowerCase(word.charAt(k));
					if (level.indexOf(c) < 0) {
						break;
					}
					lettersCount--;
				}
				if (lettersCount == 0) {
					result.add(word);
					break;
				}
			}
		}
		return result.toArray(new String[0]);

	}

}
