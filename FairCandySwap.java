package Day09Nov2022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FairCandySwap {

	@Test
	public void td1() {
		int[] aliceSizes = {1,1}, bobSizes = {2,3};
		int[] fairCandySwap = fairCandySwap(aliceSizes,bobSizes);
		System.out.println(Arrays.toString(fairCandySwap));
	}

	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		Set<Integer> hset = new HashSet<Integer>();
		
		
		int[] ans = new int[2];
		
		int a=0,b=0;
		
		for (int x : aliceSizes) {
			a += x;
		}
		
		for (int x : bobSizes) {
			b += x;
			hset.add(x);
		}
		
		int diff = (b-a) / 2;
		
		for (int x : aliceSizes) {
			if(hset.contains(x + diff)) {
				ans[0] = x;
				ans[1] = x+diff;
				break;
			}
		}
		
		return ans;

	}

}
