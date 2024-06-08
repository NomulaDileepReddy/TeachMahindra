
import java.util.Scanner;

public class SmallestVowel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String st = sc.next();
		st = st.toLowerCase();
		char ch = st.charAt(0);
		for(int i=1;i<st.length();i++) {
			if(ch>st.charAt(i)) {
				ch = st.charAt(i);
			}
		}
		System.out.println("Smallest character in the String is "+ch);
	}
}
