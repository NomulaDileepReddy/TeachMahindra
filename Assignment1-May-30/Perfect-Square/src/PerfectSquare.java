
import java.util.Scanner;

public class PerfectSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		if(Math.ceil(Math.sqrt(num))==Math.floor(Math.sqrt(num))) {
			System.out.println(num+" is a perfect square.");
		}else {
			System.out.println(num+" is not a perfect square.");
		}
	}
}
