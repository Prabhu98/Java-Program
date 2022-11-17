package Day5;

import org.junit.Test;

public class ReversePrefixWord {

	@Test
	public void example1() {
		String word = "abcdefd";
		char ch = 'd';
		String reversePrefix = reversePrefix(word, ch);
		System.out.println(reversePrefix);
	}

	public String reversePrefix(String word, char ch) {

		int len = word.length();

		char[] c = word.toCharArray();

		int start = 0;
		int i = 0;

		for (i = 0; i < len; i++) {

			if (c[i] == ch) {
				break;
			}

		}
		if (i == c.length) {
			return word;
		}

		while (start < i) {// da
			char ch1 = c[start];// b
			c[start] = c[i];// c
			c[i] = ch1;// b
			start++;
			i--;

		}

		return new String(c);

	}

	public void reversePrefixON(String word, char ch) {
		int index = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch) {
				index = i;
				break;
			}
		}
		for (int i = index; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		for (int i = index + 1; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		}
	}

}
