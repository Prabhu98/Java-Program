package Day1;

import java.util.Arrays;

import org.junit.Test;

public class ShortestChar {

	@Test
	public static void postive() {
			String s = "leet";
			char c = 't';
			int[] shortestchar = shortestToChar1(s,c);
			System.out.println(Arrays.toString(shortestchar));
	}
	
	
	public static int[] shortestToChar(String s, char c) {
		 int[] arr=new int[s.length()];
	        for(int i=0;i<s.length();i++)
	        {
	            int left=i-1;
	            int right=i+1;
	            while(left>=0 || right <s.length())
	            {
	                if(s.charAt(i)==c)
	                {
	                    arr[i]=0;
	                    break;
	                }
	                
	                if(right < s.length() && s.charAt(right) == c)
	                {
	                    arr[i]=right-i;
	                    break;
	                }
	                if( left >= 0 && s.charAt(left)== c)
	                {
	                    arr[i]=i-left;
	                    break;
	                }
	                left--;
	                right++;
	            }
	        }
	         return arr;
	    }
		
	public static int[] shortestToChar1(String s, char c)	{
		
		int len = s.length();
		
		int[] op = new int[len];
		
		int index = -len;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				index =i;
			}
			op[i] = i-index;
		}
		
		for (int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i) ==c) {
				index =i;
			}
			int value = Math.abs(i-index);
			op[i] = Math.min(op[i], value);
		}
		
		
		
		return op;
		        
		   		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postive();
	}

}
