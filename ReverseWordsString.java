package Day4;

import java.util.Arrays;

import org.junit.Test;

public class ReverseWordsString {
	
	@Test
	public static void postive() {
			String str = "Let's take LeetCode contest";
			String revwords = reverseWords1(str);
			System.out.println(revwords);
	}
	
	@Test
	public static void negative() {
			String str = "L";
			String revwords = reverseWords1(str);
			System.out.println(revwords);
	}
	
	@Test
	public static void edge() {
			String str = "Let  ";
			String revwords = reverseWords1(str);
			System.out.println(revwords);
	}

	 public static String reverseWords(String s) {
		 
		 String finalstr ="";
	        String tempstr = "";
	        
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            
	            if( c == ' '){
	                finalstr = finalstr+tempstr+" ";
	                tempstr =" ";
	            }else {
	                tempstr = c+tempstr;
	            }
	        }
	        finalstr = finalstr+tempstr;
	        return finalstr;
			    
			 }

 public static String reverseWords1(String s) {
		 
	 String[] input = s.split(" ");
	 
	 String finalStr ="";
	 
	 for (String w : input) {
		 
		 String rev ="";
		 
		 for(int i=w.length()-1;i>=0;i--) {
			 rev = rev + w.charAt(i);
		 }
		finalStr = finalStr + rev+" ";
	}
		 return finalStr.trim();
			    
		}
 
		 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postive();
		edge();
		negative();
	}

}
