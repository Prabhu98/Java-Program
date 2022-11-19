package Day18Nov2022;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestNiceSubString {
	
	
 @Test
 public void td1() {
	 String s="YazaAay";
	 String longestNiceSubstring = longestNiceSubstring(s);
	 System.out.println(longestNiceSubstring);
 }
 
 
 public String longestNiceSubstring(String s) {
     Set<Character> set = new HashSet<>();
     for (char ch : s.toCharArray())
         set.add(ch);
     for (int i=0; i<s.length(); i++) {
         char current = s.charAt(i);
         if (set.contains(Character.toUpperCase(current)) && set.contains(Character.toLowerCase(current)))
             continue;
         String str1 = longestNiceSubstring(s.substring(0, i));
         String str2 = longestNiceSubstring(s.substring(i + 1));
         return str1.length() >= str2.length() ? str1 : str2;
     }
     return s;
 }

}
