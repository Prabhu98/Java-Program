package Day02Nov2022;

import org.junit.Test;

public class SubStringofSizeThreeDistinctChar {
	
	@Test
	public void td1(){
		String s = "xyzzaz";
		int countGoodSubstrings = countGoodSubstrings(s);
		System.out.println(countGoodSubstrings);
	}
	

	public int countGoodSubstrings(String s) {
        int i=0,j=0,count=0;
        int n =s.length();
        int k =3;
        while(j < n){
            if(j-i+1< k){
                j++;
            }else {
                if(j-i+1 == k){
                    if(s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(i+1) &&
                    s.charAt(i) != s.charAt(i+1)){
                        count++;
                    }
                    i++;
                    j++;
                }
            }

        }
		return count;
	}

}
