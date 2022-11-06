/**
 * 
 */
package Day06Nov2022;

import org.junit.Test;

/**
 * @author prabhu A
 *
 */
public class GetOccurance {

	
	
	
	
	@Test
	public void td1() {
		String s = "ZAAVVDDSSSG";
		String occurance = getOccurance(s);
		System.out.println(occurance);
	}
	
	
	

	/**
	 * initialize start =0 end =0,count=0 compare i and i+1
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param s
	 * @return
	 */

	public String getOccurance(String s) {

		StringBuilder sb = new StringBuilder();

		int start = 0, end = 0, count = 0;

		char[] ch = s.toCharArray();

		while (end < s.length()) {
			if (ch[start] == ch[end]) {
				count++;
				end++;

			} else if (ch[start] != ch[end]) {
				sb.append(count + "");
				sb.append(s.charAt(start));
				count = 0;
				start = end;
			}

		}
		sb.append(count + "");
		sb.append(s.charAt(start));
		return sb.toString();

	}

}
