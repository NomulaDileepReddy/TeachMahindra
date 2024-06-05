
import java.util.Scanner;

public class VowelsConsonantsCount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String st = sc.nextLine();
		int cCount = 0, vCount = 0;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch == 'a' || ch=='e' || ch == 'i' || ch== 'o' || ch == 'u'||ch == 'A' || ch=='E' || ch == 'I' || ch== 'O' || ch == 'U'  ){
					vCount++;
				}else {
					cCount++;
				}
			}
		}
		System.out.println("Vowel count is "+vCount);
		System.out.println("Consonants count is"+cCount);
			
	}
}
