package leetcode;

public class SortingSentences {
	/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"*/
	
   public static String sortSentence(String s) {
        String orginal ="";
        String[] res = s.split(" ");
        String[] tempstr = new String[res.length];
        
        for(int i=0;i<res.length;i++){
        	int wordpos = res[i].charAt(res[i].length()-1) -'0';
        	tempstr[wordpos-1] = res[i].substring(0, res[i].length()-1);
        }
        for (String word : tempstr) {
        	orginal += word;
        	orginal = orginal.concat(" ");
		}
        
		return orginal = orginal.trim();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "is2 sentence4 This1 a3";
		String sortSentence = sortSentence(s);
		System.out.println(sortSentence);
 
	}

}
