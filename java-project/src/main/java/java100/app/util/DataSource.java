package java100.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataSource {

	private String driverClassName;
	private String url;
	private String username;
	private String password;

	// 여러 스레드가 사용할 커넥션을 담을 바구니 준비
	static ArrayList<Connection> list = new ArrayList<>();

	// 커넥션을 빌리거나 반납할 때 한 번에 한 스레드만이 호출할 수 있다.
	synchronized public static Connection getConnection() throws SQLException {

		// 기존에 존재하는 커넥션 객체가 있다면 그것을 빌려준다.
		if (list.size() > 0) {
			return list.remove(0);
		}

		// 없다면 새로 만들어 빌려준다.
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
	}

	synchronized public static void returnConnection(Connection con) {
		try {
			if (con == null)
				return;
			if (con.isClosed())
				return;
			list.add(con);

		} catch (Exception e) {
		}
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}