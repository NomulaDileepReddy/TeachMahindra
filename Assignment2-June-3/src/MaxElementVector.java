
import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;

public class MaxElementVector {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		System.out.println("Maximum element in the vector is "+ Collections.max(v));
	}
}
