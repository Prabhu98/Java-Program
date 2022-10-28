import java.util.Arrays;

import org.junit.Test;

public class Anagram {
	
	  @Test public void tc1() { String s ="listen"; String t ="silent"; boolean
	  anagram = isAnagram(s,t); System.out.println(anagram); }
	 
	@Test
	public void tc2() {
		String s ="rat";
		String t ="car";
		boolean anagram = isAnagram(s,t);
		System.out.println(anagram);
	}
	
	
	  @Test public void tc3() { String s ="ra"; String t ="c"; boolean anagram =
	  isAnagram(s,t); System.out.println(anagram); }
	 
	
	public boolean isAnagram(String s, String t) {
		
		 
		
		 int n1 =s.length();
		 int n2=t.length();
		 
		 if(n1!=n2)return false;
		  
		 char[] s1 = s.toCharArray();
		 char[] s2 = t.toCharArray();
		 
		 Arrays.sort(s1);
		 Arrays.sort(s2);
		 
		 for(int i=0;i<n1;i++) {
			 
			 if(s1[i] !=s2[i]) {
				 return false;
			 
		 }
		 }
		
		
		return true;
		
		
	}

}
