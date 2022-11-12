package Day08Nov2022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class BuddyStrings {

	@Test
	public void td1() {
		String s = "ab", goal = "ba";
		boolean buddyStrings = buddyStrings(s, goal);
		System.out.println(buddyStrings);
	}

	public boolean buddyStrings(String A, String B) {
		if (A.length() != B.length())
			return false;

		if (A.equals(B)) {
			Set set = new HashSet();
			for (char c : A.toCharArray()) {
				if(set.contains(c)) return true;
				set.add(c);
			}
			return false;
		}else {
			 List<Integer> list = new ArrayList<Integer>();
			 for(int i=0;i<A.length();i++) {
				 if(A.charAt(i) != B.charAt(i)){
					 return list.add(i);
				 }
			 }
			 return list.size()==2 && A.charAt(list.get(0)) == B.charAt(list.get(1)) &&  A.charAt(list.get(1)) == B.charAt(list.get(0));
			}
	}
}
