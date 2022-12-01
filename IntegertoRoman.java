package leetcode;

public class IntegertoRoman {
	
	public static String intToRoman(int num) {
        
	    /*
	       M-1000
	       CM-900
	       D-500
	       CD-400
	       C-100
	       XC-90
	       XL-40
	       L-50
	       
	       x-10
	       IX=9  
	       v-5
	       IV-4
	       I-1
	    */
	        
	        int[] intcode = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	        
	        String[] code = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	        
	        StringBuilder sb  = new StringBuilder();
	        for(int i=0;i<intcode.length;i++){
	            while(num >= intcode[i]){
	              sb.append(code[i]);
	              num-=intcode[i];
	         }
	            
	        }
	        return sb.toString();  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intToRoman = (String)intToRoman(994);
		System.out.println(intToRoman);
	}

}
