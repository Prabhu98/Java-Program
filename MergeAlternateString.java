package TestLeafJavaProgram;

import java.util.Arrays;

import org.junit.Test;

public class MergeAlternateString {
	
	@Test
	public static void postive() {
			String word1 = "abc";
			String word2 = "pqr";
			String mergeAlternately = mergeAlternately1(word1,word2);
			System.out.println(mergeAlternately);
		
	}
	
	@Test
	public static void negative() {
			String word1 = "";
			String word2 = "";
			String mergeAlternately = mergeAlternately1(word1,word2);
			System.out.println(mergeAlternately);
		
	}
	
	@Test
	public static void edge() {
			String word1 = "abcd";
			String word2 = "zt";
			String mergeAlternately = mergeAlternately1(word1,word2);
			System.out.println(mergeAlternately);
		
	}
	
	/**
	 *  to find length for word1
	 *  to length length for word2
	 *  Initialize result =0;
	 *  Initialize Start =0 and end =0
	 *  new char array created for word1 and word2
	 *  traversal loop--for loop from 0 to length1+length2
	 *  if check condition i < word1.length
	 *  then add it new char array using charAt(i)
	 *  result increment by 1
	 *  start increment by 1
	 *  if check condition i < word2.length
	 *  then add it new char array using charAt(i)
	 *  result increment by 1
	 *  end variable increment by 1
	 *  print the new array
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param word1
	 * @param word2
	 * @return
	 */
    
	public static String mergeAlternately(String word1, String word2) {
		
		int length1 = word1.length();
	
		
		int length2 = word2.length();

		
		int result =0;
		
		int start =0,end=0;
		
		char[] newarr = new char[length1 + length2];
		
		for(int i=0;i<length1+length2;i++) {
				
				if(i < length1) {
					newarr[result] = word1.charAt(start); //a
					result++;
					start++;
				}if(i < length2) {
					newarr[result] = word2.charAt(end);//z
					result++;
					end++;		
				}
			}
			return new String(newarr);//apbq
		}
	
	//two pointer 
	
	public static String mergeAlternately1(String word1, String word2) {
		
		int l1 = word1.length() , l2=word2.length();
		
		char[] resultarr = new char[l1+l2];
		
		int result =0, i=0,j=0;
		
		while(i < l1 || j < l2) {
			
			if(i < l1) {
				resultarr[result++] = word1.charAt(i++);		
			}
			if(j < l2) {
				resultarr[result++] = word2.charAt(j++);
			}
		}
		
	   return new String(resultarr);
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postive();
		negative();
		edge();
	}

}
