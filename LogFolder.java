package Day26Nov2022;

import java.util.Stack;

import org.junit.Test;

public class LogFolder {
	
	
	
	@Test
	public void td1() {
		String[] l1 = {"d1/","d2/","./","d3/","../","d31/"};
		int makeGood = minOperations(l1);
		System.out.println(makeGood);
	}
	
	
	
	
	public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<logs.length;++i){
                if(logs[i].charAt(0)>='a' && logs[i].charAt(0)<='z' ){
                    stack.push(logs[i]);
                }
                if(logs[i].equals("../")){
                    if(!stack.isEmpty())  stack.pop();
                }
        }
        return stack.size();
    }

}
