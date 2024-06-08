
import java.util.Scanner;

public class CharAtOddPosition {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int i = 1;
		while(i<st.length()) {
			System.out.print(st.charAt(i));
			i=i+2;
		}
	}
}
