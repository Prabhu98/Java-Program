package Day30Nov2022;

import java.util.HashMap;
import java.util.Map.Entry;

public class UindexProgram {

	
	
	public static void main(String[] args) {
		String s ="abcdefghjklmnopqrstuvwxyz";
		
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		
		for(int i =0 ;i<s.length();i++) {
			hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+ i+1);
		}
		
		for (Entry<Character, Integer> ent : hmap.entrySet()) {
			Character key1 = ent.getKey();
			
			if(key1.equals('u')){
				Integer value = ent.getValue();
				System.out.println(value);
			}
		}
	}
}
