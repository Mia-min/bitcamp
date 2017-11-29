// DBMS 서버에게 SQL문을 보내기
// => 데이터 입출력 테스트를 위한 테이블 생성하라!
//    bitcamp-docs/jdbcexam.sql 을 실행하라!
// 
package bitcamp.java100.ch17.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test4 {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");

		System.out.println("연결되었음!");

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from jdbc_test");

		while (rs.next()) {
			System.out.printf("%d, %s, %s, %s, %d\n", rs.getInt("no"), rs.getString(2), rs.getString("conts"),
					rs.getString("regdt").toString(), rs.getInt("vwcnt"));
		}

		rs.close();
		stmt.close();
		con.close();
	}

}
