
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StringCaseChange {
	public static void main(String args[]) {
		List<String> ls = new ArrayList<String>();
		ls.add("Dileep");
		ls.add("Tehith");
		ls.add("Raina");
		ls.add("Devilliers");
		ls.add("Dhoni");
		
		List<String> lower = ls.stream().map(String::toLowerCase).collect(Collectors.toList());
		
		List<String> upper = ls.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		
		System.out.println(lower);
		System.out.println(upper);
	}
}
