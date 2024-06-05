
import java.util.Scanner;

public class ReverseOfString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String st = sc.next();
		st = st.toLowerCase();
		String ans = "";
		int i = 0;
		while(i<st.length()) {
			ans = st.charAt(i) + ans;
			i++;
		}
		System.out.println("String Reversed "+ans);
	}
}
