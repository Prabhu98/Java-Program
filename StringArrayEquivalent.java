package TestLeaf;

import org.junit.Test;

public class StringArrayEquivalent {

	/*
	 * @Test public void td1() { String[] word1 = { "ab", "c" }, word2 = { "a", "bc"
	 * }; boolean arrayEquivalent = isArrayEquivalentON(word1, word2);
	 * System.out.println(arrayEquivalent); }
	 */

	@Test
	public void td2() {
		String[] word1 = { "abc", "d", "defg" }, word2 = { "abcddefg"};
		boolean arrayEquivalent = isArrayEquivalentON(word1, word2);
		System.out.println(arrayEquivalent);
	}

	public boolean isArrayEquivalent(String[] words1, String[] words2) {

		String res1 = "";
		String res2 = "";
		for (int i = 0; i < words1.length; i++) {
			res1 = res1 + words1[i];
		}

		for (int i = 0; i < words2.length; i++) {
			res2 = res2 + words2[i];
		}

		if (res1.equals(res2)) {
			return true;
		}
		return false;

	}

	public boolean isArrayEquivalentON(String[] words1, String[] words2) {

		int start = 0;
		
		String res1 =" " , res2 =" "; 
        
		while (start < words1.length || start < words2.length) {
			if(start <words1.length)	
			 res1 = res1 +words1[start];
			if(start < words2.length)
			 res2 = res2 +words2[start];
			start++;
			
		}
		
		if (res1.equals(res2)) {
			return true;
		}

	   return false;

	}

}
