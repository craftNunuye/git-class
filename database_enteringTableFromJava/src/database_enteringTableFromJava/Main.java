package database_enteringTableFromJava;

import java.sql.*;

public class Main {

	public static void main(String[] args) throws Exception {
		createTable();
	}

	public static void createTable() throws Exception{
	  	try{
		  		Connection myConn = getConnection();
				//Statement mystmt = myConn.createStatement();
		  		PreparedStatement create = myConn.prepareStatement("CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))"); 
		  		create.executeUpdate();	 
	  		} catch(Exception e){
	  				System.out.println(e);}
	  		finally{ 
	  			System.out.println("Function complete.");
	  			}
	}
	  	
	  public static Connection getConnection() throws Exception{
	  
	  		try{
		  		String driver = "com.mysql.cj.jdbc.Driver";
		  		String url = "jdbc:mysql://localhost:3306/ADD_TABLE_NAME_HERE";
		  		String user= "ADD USER NAME HERE";
		  		String passwd= "ADD PASSWORD HERE";
		  		Class.forName(driver);
		  		
		  		Connection myConn = DriverManager.getConnection(url, user, passwd);
		  		System.out.println("connected");
	  		
		  		return myConn;
	  		
	  		}catch(Exception e) {
	  			System.out.println(e);
	  		}
	  			return null;
	 
	  }

}
