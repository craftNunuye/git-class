package com.icraft_Amies;

import java.sql.*;

public class Amies {
	
	//1.create connection 
	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/FriendsInfo";
			String user = "root";
			String pass = "yourpass";
			Class.forName(driver);	
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println(conn + "connected.");
			return conn;
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
		
	}
	//2.make statement
	public static void createTable() throws Exception {
		try {
			Connection conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement("CREATE TABLE IF NOT EXISTS mAmie(id int NOT NULL AUTO_INCREMENT, Last varchar(255), First varchar(255), Phone_Num double, Email varchar(255), PRIMARY KEY(id))");
			stmt.executeUpdate();
			} catch(Exception e) {
			System.out.println(e);
		} finally {System.out.println("Function createTable complete.");
		
		}
		
	}
			//3. create a query
	public static void insertIntoTable() throws Exception{
		try {
			Connection myconn = getConnection();// need to create local var for method getconnction.
			Statement mystmt = myconn.createStatement(); // this is for selecting all data in the select * all command to read all 
			String query = "insert into mAmie(id, Last, First, Phone_Num, Email) "
					+ "values(?,?, ?, ?, ?)";
								
			PreparedStatement stmt = myconn.prepareStatement(query);

			//inserting data
//		stmt.setInt(1,1);
//		stmt.setString(2, "Yonas");
//		stmt.setString(3,  "Betty");
//		stmt.setInt(4, 1234560000);
//		stmt.setString(5,"Betty.Yonnas@foo.com");
		
//		stmt.setInt(1, 23);
//		stmt.setString(2, "Hirut");
//		stmt.setString(3,  "Bikilla");
//		stmt.setDouble(4, 456768990);
//		stmt.setString(5,"Hirut.Beki@goo.com");
//		
//		stmt.setInt(1,33);
//		stmt.setString(2, "Sammy");
//		stmt.setString(3,  "Yihune");
//		stmt.setDouble(4, 314533300);
//		stmt.setString(5,"sammyYihune@mone.com");
		
//		stmt.setInt(1,91);
//		stmt.setString(2, "Bob");
//		stmt.setString(3,  "Marley");
//		stmt.setDouble(4, 1234567777);
//		stmt.setString(5,"Bob.Marl@Reggae.com");
		
		//execute 
		stmt.execute();
		
		// print to console
		
		ResultSet rs = mystmt.executeQuery("select * from mAmie");
		while(rs.next()) {
		System.out.println("id is " + rs.getInt(1) + " full name is " + rs.getString(2) + " " + rs.getString(3) + " and number and email " + rs.getDouble(4) + " ,email- " + rs.getString(5));}
			
		} catch (Exception e){
			System.out.println(e);
			
		}finally {
			System.out.println("Function createTable complete.");
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		createTable();
		insertIntoTable();
		//3. create a query 
		//4. process result 
	}

}