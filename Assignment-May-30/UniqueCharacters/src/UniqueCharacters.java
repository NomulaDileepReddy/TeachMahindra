
import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharacters {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String st = sc.next();
		int arr[] = new int[26];
		Arrays.fill(arr, 0);
		for(int i=0;i<st.length();i++) {
			arr[st.charAt(i)-'a']++;
		}
		for(int i=0;i<st.length();i++) {
			if(arr[st.charAt(i)-'a']==1) {
				System.out.println(st.charAt(i));
			}
		}
	}
}
