package Day03Nov2022;

import java.util.HashSet;

import org.junit.Test;

public class UniqueMorse {
	
	
	@Test
	public void td1() {
		String[] words = {"gin","zen","gig","msg"};
		int uniqueMorseRepresentations = uniqueMorseRepresentations(words);
		System.out.println(uniqueMorseRepresentations);
		
	}
	
	
	
	
	
	
    public int uniqueMorseRepresentations(String[] words) {
    	
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> set = new HashSet<>();
        
        for(String word: words)
        {
            String str="";
            char[] w = word.toCharArray();
            for(char c:w)
            {
            	
            	String d = morse[c-'a'];
                str += d;
            }
            System.out.println(word+" = "+str);
            set.add(str);
        }
        return set.size();
        
    }
    
    
    

}
