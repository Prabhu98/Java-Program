import org.junit.Test;

public class ReverseCharacternotNumber {
	
	
	
	@Test
	public void tc2() {
		String s = "A1B2C3";
		String revOnlyLetters = revOnlyLetters(s);
		System.out.println(revOnlyLetters);
		
	}
	
	
	public String revOnlyLetters(String s) {
		
		int start =0,end=s.length()-1;
		
		char[] ch = s.toCharArray();
		
		while(start < end) {
			
			if(Character.isLetter(ch[start]) && Character.isLetter(ch[end])) {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}else {
				if(!Character.isLetter(ch[start])) {
					start++;
				}
					end--;
		}
		
		
	}
		return String.valueOf(ch);


}
	
	
	  public boolean isLetter(char c ){
	        boolean flag = false;
	        
	         if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
	            flag = true;
	        }
	        return flag;
	    }
}