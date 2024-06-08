
import java.util.Scanner;

public class SpaceCharacterCount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String st = sc.nextLine();
		int count = 0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Total no of spaces in the string is "+count);
	}
}
