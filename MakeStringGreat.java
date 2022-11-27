package Day26Nov2022;

import java.util.Stack;

import org.junit.Test;

public class MakeStringGreat {

	@Test
	public void td1() {
		String s = "leEeetcode";
		String makeGood = makeGood(s);
		System.out.println(makeGood);
	}

	public String makeGood(String s) {
		
		Stack<Character> s1 = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			char a =  s.charAt(i);
			if(s1.size()==0) {
				s1.push(a);
			}else {
				Character b = s1.peek();
				if(b -'a' ==a-'A'|| a-'a' == b-'A') {
					s1.pop();
				}else {
					s1.push(a);
				}
			}
		}
		
		String res = "";
		while(s1.size()!=0) {
			res = s1.pop() + res;
		}
		
		return res;

	}
}
