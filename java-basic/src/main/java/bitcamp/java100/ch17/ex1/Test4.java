package bitcamp.java100.ch17.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test4 {
	public static void main(String[] args) throws Exception {

		java.sql.Driver driver = new com.mysql.jdbc.Driver();

		DriverManager.registerDriver(driver);
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "password=1111");
		System.out.println("연결되었음");

		con.close();
	}
}
