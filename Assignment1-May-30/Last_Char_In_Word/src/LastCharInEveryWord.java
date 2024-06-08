
import java.util.Scanner;

public class LastCharInEveryWord {
	public static void main(String argws[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String st = sc.nextLine();
		int i=0;
		char prev=' ';
		while(i<st.length()) {
			char ch = st.charAt(i);
			if(i!=0) {
				prev =  st.charAt(i-1);
			}
			if((ch==' ') &&  Character.isAlphabetic(prev)) {
				System.out.print(st.charAt(i-1));
			}
			if(i==st.length()-1) {
				System.out.print(st.charAt(i));
			}
			i++;
		}
	}
}
