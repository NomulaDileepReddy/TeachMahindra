
import java.util.Arrays;
import java.util.ArrayList;


public class ArraytoCollection {
	public static void main(String args[]) {
		Integer [] ar = {1,2,3,4,5};
		ArrayList<Integer> ans = new ArrayList<Integer>(Arrays.asList(ar));
		System.out.println(ans);
	}
}
