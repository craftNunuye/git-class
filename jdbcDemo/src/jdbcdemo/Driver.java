package jdbcdemo;

// This comment was added on git edit.

import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		try {
			//1. Get a connection to database
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "M!23944l");
			
			// 2. Create a statement
					Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from employee");
			
			// 4. Process the result set
					while (myRs.next()) {
						System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
					}
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}
}
