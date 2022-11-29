package Day28Nov2022;

import org.junit.Test;

public class SmallestNumberSumIsN {
	
	
	@Test
	public void td1() {
		int n = 9;
		smallestNumber(n);
	}
	
	
	public int getSum(int n)
	{
	    int sum = 0;
	    while (n != 0)
	    {
	        sum = sum + n % 10;
	        n = n / 10;
	    }
	    return sum;
	}
	
	
	
	public  void smallestNumber(int N)
	{
	    int i = 1;
	    while (i != 0)
	    {
	        if (getSum(i) == N)
	        {
	            System.out.print(i);
	            break;
	        }
	        i++;
	    }
	}

}
