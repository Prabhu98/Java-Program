package leetcode;

import java.util.Arrays;

public class ValidAnagram {
/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false*/
	
public static boolean isAnagram(String s, String t) {
        
        
        
        
        int[] charcount = new int[26];
        for(int i=0;i<s.length();i++){
            charcount[s.charAt(i)- 'a']++;
            charcount[t.charAt(i)- 'a']--;
        }
        for(int i : charcount){
            if(i != 0){
                return false;
            }
        }
        return true;
    }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";
		boolean anagram = isAnagram(s,t);
		System.out.println(anagram);
	}

}
