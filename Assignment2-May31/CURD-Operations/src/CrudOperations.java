import java.sql.*;
import java.util.Scanner;


public class CrudOperations {
	public static void main(String args[]) {
		System.out.println("1. Select");
		System.out.println("2. Insert");
		System.out.println("3. Delete");
		System.out.println("4. Update");
		System.out.println("5. Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("-------------  Enter your choice  --------------");
		System.out.print("Enter : ");
		int ch = sc.nextInt();
		while(ch<=5) {
			if(ch==1) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket_teams?useSSL=false","root","Dileep@123");
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from India");
					while(rs.next()) {
						System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +rs.getInt(3) + " " + rs.getInt(4)+ " "  + rs.getInt(5));
					}
					System.out.println();
					System.out.println("All the rows fetched successfully");
					System.out.println();
					
				}
				catch(Exception ex) {
					System.out.println(ex);
					ex.printStackTrace();
				}
			}else if(ch==2) {
				try {			
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket_teams?useSSL=false","root","Dileep@123");
					System.out.print("Enter crickter name : ");
					String name = sc.next();
					System.out.print("Enter his role : ");
					String role = sc.next();
					System.out.print("No of matches played : ");
					int matches_played = sc.nextInt();
					System.out.print(name + "'s highest score : ");
					int highScore = sc.nextInt();
					System.out.print("Total runs "+name+ " in his career : ");
					int total_runs = sc.nextInt();
					
					PreparedStatement pstmt = con.prepareStatement("insert into India(name,role,matches_played,highScore,total_runs) values(?,?,?,?,?)");
					pstmt.setString(1, name);
					pstmt.setString(2, role);
					pstmt.setInt(3, matches_played);
					pstmt.setInt(4, highScore);
					pstmt.setInt(5, total_runs);
					
					int rowsInserted = pstmt.executeUpdate();
					System.out.println();
					if (rowsInserted > 0) {
	                    System.out.println("A new player was inserted successfully!");
	                }
					System.out.println();
				}
				catch(Exception ex) {
					System.out.println(ex);
					ex.printStackTrace();
				}
			}
			
			else if(ch == 3) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket_teams?useSSL=false","root","Dileep@123");
					PreparedStatement st = con.prepareStatement("delete from India where name = ?");
					System.out.print("Enter crickter name to delete : ");
					String name = sc.next();
					st.setString(1, name);
					int res = st.executeUpdate();
					System.out.println();
					if(res>0) {
						System.out.println("One row deleted successfully");
					}
					else {
						System.out.println("There is no such row named "+name);
					}
					System.out.println();
				}catch(Exception ex) {
					System.out.println(ex);
					ex.printStackTrace();
				}
			}
			else if(ch==4){
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket_teams?useSSL=false","root","Dileep@123");
					PreparedStatement st = con.prepareStatement("update India set role =?, matches_played = ?, highScore = ?, total_runs = ? where name = ?");
					System.out.print("Enter which crickter details to be updated : ");
					String name = sc.next();
					System.out.print("Enter his role : ");
					String role = sc.next();
					System.out.print("No of macthes played : ");
					int matches_played = sc.nextInt();
					System.out.print(name + "'s highest score : ");
					int highScore = sc.nextInt();
					System.out.print("Total runs "+name+ " in his career : ");
					int total_runs = sc.nextInt();
					st.setString(1, role);
					st.setInt(2, matches_played);
					st.setInt(3, highScore);
					st.setInt(4, total_runs);
					st.setString(5,  name);
					
					int rowUpdate = st.executeUpdate();
					System.out.println();
					if(rowUpdate>0) {
						System.out.println("One row successfully updated");
					}else {
						System.out.println("There is no such row to be updated");
					}
					System.out.println();
				}
				catch(Exception ex) {
					System.out.println(ex);
					ex.printStackTrace();
				}
			}
			System.out.println("------------------------------------------------");
			System.out.println("1. Select");
			System.out.println("2. Insert");
			System.out.println("3. Delete");
			System.out.println("4. Update");
			System.out.println("5. Exit");
			System.out.println("-------------  Enter your choice  --------------");
			System.out.print("Enter : ");
			ch = sc.nextInt();
		}
		System.out.println("Database Updated....!");
		
	}
}
