package Day31Oct;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * 
 * Given a string paragraph and a string array of the banned words banned,
 * return the most frequent word that is not banned. It is guaranteed there is
 * at least one word that is not banned, and that the answer is unique.
 * 
 * The words in paragraph are case-insensitive and the answer should be returned
 * in lowercase.
 * 
 
 * @author prabhu A
 *
 */

public class MostCommonWord {

	@Test
	public void tc1() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };
		String result = mostCommonWord(paragraph, banned);
		System.out.println(result);

	}
	
	@Test
	public void tc2() {
		String paragraph = "a.";
		String[] banned = {};
		String result = mostCommonWord(paragraph, banned);
		System.out.println(result);

	}
	
	/**
	 * replaceAll the ,!?'; symbol using space and convert to lowercase and spilt the word one or more spaces
	 * Initialize hashmap
	 * iterate para add it to the hmap
	 * check condition banned word in hmap
	 * then remove banned word from hmap
	 * then iterate through keyset
	 * if getValue() > 1
	 * then return getkey store in string variable
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param paragraph
	 * @param banned
	 * @return
	 */

	public String mostCommonWord(String paragraph, String[] banned) {
		if (paragraph == null || paragraph.length() == 0) {
			return "String is empty";
		}

		String[] para = paragraph.replaceAll("[!?',;.]", " ").toLowerCase().split("\\s+");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		for (String word : para) {
			if (hmap.containsKey(word)) {
				hmap.put(word, hmap.getOrDefault(word, 0) + 1);
			} else {
				hmap.put(word, 1);
			}
		}

		for (String ban : banned) {
			if (hmap.containsKey(ban)) {
				hmap.remove(ban);
			}
		}
		
		String res = null;


		for(String word : hmap.keySet())
			if(res == null || hmap.get(word) > hmap.get(res))
				res = word;
		/*
		 * String mostcommonword = ""; for (Map.Entry<String, Integer> entry :
		 * hmap.entrySet()) {
		 * 
		 * if (entry.getValue() > 1) { mostcommonword = entry.getKey();
		 * 
		 * }
		 * 
		 * }
		 */
		 
		
		
		return res;
	}
}
