package Day05Nov2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagram {
	
	
	@Test
	public void td1() {
		String[] words = {"eat","tea","tan","ate","nat","bat"};
		List<String> groupAnagrams = Arrays.asList("eat","tea","tan","ate","nat","bat");
		System.out.println(groupAnagrams(words));
	}
	/**
	 *  /* If String[] is empty, return empty. 
     * Create a HashMap out with HashMap<Character,Integer> as key and List<String> as value.
     * Iterate the input
     *   Create a Hashmap and add each item to hashmap.
     *   Check if its already in hashmap, if yes get the value of the hashmap and append the current item to the list.
     *   else add to HashMap out
     * return values of the HashMap
     * 
	 * 
	 * 
	 * 
	 * 
	 * @param words
	 * @return
	 */

	public List<List<String>> groupAnagrams(String[] words) {
		
		if(words.length == 0) return new ArrayList();// empty list
		
		Map<Map<Character, Integer>, List<String>> outMap = new HashMap<>();
		
		for(int i=0;i<words.length;i++) {
			
			Map<Character,Integer> hmap1 = new HashMap<Character,Integer>();
			
			     for (char c : words[i].toCharArray()) {
					hmap1.put(c, hmap1.getOrDefault(c, 0)+1);
				}
			     
			if(outMap.containsKey(hmap1)) {
				List<String> lst = outMap.get(hmap1);
				lst.add(words[i]);			
			}else {
				List<String> tlist = new ArrayList<>(Arrays.asList(words[i]));
				outMap.put(hmap1, tlist);
			}
		}

       List<List<String>> olist = new ArrayList();
       olist.addAll(outMap.values());

       return olist;

	}

}
