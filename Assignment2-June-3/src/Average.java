
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Average {
	public static void main(String args[]) {
		List<Integer> li = Arrays.asList(1,2,3,4,5);
		
		double ave = li.stream().mapToInt(Integer::intValue).average().orElse(0.0);	
		System.out.println("Average " + ave);
	}
}
