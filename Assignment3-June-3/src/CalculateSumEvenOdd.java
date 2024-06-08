
import java.util.List;
import java.util.ArrayList;

public class CalculateSumEvenOdd {
	public static void main(String args[]) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(12);
		ls.add(13);
		ls.add(14);
		ls.add(15);
		ls.add(12);
		
		int evenSum = ls.stream().mapToInt(Integer::intValue).filter(num->num%2==0).sum();
		
		int oddSum = ls.stream().mapToInt(Integer::intValue).filter(num->num%2!=0).sum();
		
		System.out.println("Sum of even numbers in the List are "+evenSum);
		System.out.println("Sum of odd numbers in the List are "+oddSum);
	}
}
