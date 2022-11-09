package Day09Nov2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class UncommonWords {

	@Test
	public void td1() {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";
		String[] uncommonFromSentences = uncommonFromSentences(s1, s2);
		System.out.println(Arrays.toString(uncommonFromSentences));

	}

	public String[] uncommonFromSentences(String s1, String s2) {
		String s3 = s1 + " " + s2;
		String[] s4 = s3.split(" ");
		List<String> list = new ArrayList<>();
		HashMap<String, Integer> hmap = new HashMap<>();
		for (String word : s4) {
			hmap.put(word, hmap.getOrDefault(word, 0) + 1);
		}
		for (String s : hmap.keySet())
			if (hmap.get(s) == 1)
				list.add(s);
		return list.toArray(new String[0]);

	}
}
