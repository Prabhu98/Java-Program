package Day17Nov2022;

import org.junit.Test;

public class ValidPalindromeII {

	@Test
	public void td1() {
		String s = "abcbea";
		boolean validPalindrome = validPalindromeII(s);
		System.out.println(validPalindrome);
	}

	public boolean validPalindrome(String s) {

		int left = s.length() / 2 - s.length() % 2, right = s.length() / 2 + s.length() % 2;

		if (left == right)
			left--;

		while (left >= 0) {
			if (s.charAt(left--) != s.charAt(right++))
				return false;
		}
		return true;
	}

	public boolean validPalindromeII(String s) {

		int left = 0, right = s.length() - 1;

		while (left <= right) {
			if (s.charAt(left) != s.charAt(right)) {
				//boolean value1 = isPalindrome(s,left+1,right);
				//boolean value2 = isPalindrome(s,left,right-1);
				
				return isPalindrome(s,left+1 ,right) || isPalindrome(s,left,right-1);
			}
			left++;
			right--;
		}

		return false;

	}
	
	public boolean isPalindrome(String s,int i,int j) {
		
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		
		return true;
		
	}

}