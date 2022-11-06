package Day05Nov2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class FindAllAnagram {

	@Test
	public void td1() {
		String s = "cbaebabacd";
		String p = "abc";
		 findAnagrams(s,p);
		//System.out.println(findAnagrams);

	}

	public void findAnagrams(String s, String p) {

		Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();

		for (int i = 0; i < p.length(); i++) {
			//hmap1.put(p.charAt(i), hmap1.get(hmap1) + 1);
			hmap1.put(p.charAt(i), hmap1.getOrDefault(p.charAt(i), 0)+1);
		}
		List<Integer> lst = new ArrayList<Integer>();
		for(int i=0;i < s.length();i++) {
			for(int j=i;j<=p.length();i++) {
				hmap2.put(s.charAt(j), hmap2.getOrDefault(s.charAt(j), 0)+1);
				if(hmap1.size() == hmap2.size()) {
					if(hmap1.equals(hmap2)) {
				        System.out.println(i);;
					}
				}
			}
		}
        hmap2.clear();
		//return lst;

	}

}
