
import java.util.Scanner;
import java.util.ArrayList;
public class Solution {
	
	public static double[] findAverageOfRuns(Player[] players, int target) {
		ArrayList<Double> averages=new ArrayList<>();
		for(Player player:players) {
			if(player.getMatches_played()>=target) {
				double average=(double)player.getRuns_scored()/player.getMatches_played();
				averages.add(average);
			}
		}
		double[] result=new double[averages.size()];
		for(int i=0;i<averages.size();i++) {
			result[i]=averages.get(i);
		}
		return result;
	}
	
	public static void main(String args[]) {
		Player players[] = new Player[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("Enter Details:");
			int id=sc.nextInt();
			String name=sc.next();
			int icc_rank=sc.nextInt();
			int matches_played=sc.nextInt();
			int runs_scored=sc.nextInt();
			players[i]=new Player(id,name,icc_rank,matches_played,runs_scored);
		}
		
		int target=sc.nextInt();
		double[] averages=findAverageOfRuns(players,target);
		for(double average:averages) {
			if(average>=80 && average<=100) {
				System.out.println("Grade A");
			}else if(average>=50 && average<=79) {
				System.out.println("Grade B");
			}else {
				System.out.println("Grade C");
			}
		}
		
	}
	
}
