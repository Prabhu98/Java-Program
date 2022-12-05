package Day04Dec2022;

import org.junit.Test;

public class FactorialRep {

	@Test
	public void td1() {
		int num = 0;
		fibonacci(num);
	  
	}

	public void fibonacci(int num) {
		System.out.print(n1 +" " +n2);
		printFibo(num);

	}

	static int n1 = 0, n2 = 1, n3 = 0;

	public void printFibo(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibo(count - 1);
		}

	}
}
