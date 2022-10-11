package TestLeafJavaProgram;

import java.util.HashSet;
import java.util.Set;

public class dups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String names[] = {"Tom","Jerry","Tom","Java","Java"};
		
		Set<String> hset = new HashSet<String>();
		
		for (String dupli : names) {
			
			if(hset.add(dupli)) {
				
			}
			
		}
		System.out.println(hset);
		
		
	}

}
