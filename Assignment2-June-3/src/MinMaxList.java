

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxList {
	public static void main(String args[]) {
		List<Integer> ls = Arrays.asList(1,2,3,4,5);
		int min = Collections.min(ls);
		int max = Collections.max(ls);
		
		System.out.println("Maximum and Minimum element in the List are " + max + " and " + min);
		
	}
}
