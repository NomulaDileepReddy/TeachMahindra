
import java.util.List;
import java.util.ArrayList;
import java.util.OptionalInt;

public class MaxMinElementList {
	public static void main(String args[]) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(30);
		ls.add(40);
		ls.add(90);
		ls.add(45);
		ls.add(17);
		
		OptionalInt min = ls.stream().mapToInt(Integer::intValue).min();
		
		OptionalInt max = ls.stream().mapToInt(Integer::intValue).max();
		
		System.out.println("Maximum element in the list is "+max.getAsInt());
		System.out.println("Minimum element in the list is "+min.getAsInt());
		
	}
}
