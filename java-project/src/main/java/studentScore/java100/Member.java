
package studentScore.java100;

import java.util.Scanner;

public class Member {

	protected String name;
	protected String email;
	protected String pw;

	public Member() {
	}

	public Member(String name, String email, String pw) {

	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", pw=" + pw + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	// : > 전체 공개할 메서드는 public으로 선언한다.

	//upDate

	//printDetail

	//print

	public void input() {
		Scanner keyScan = new Scanner(System.in);

		System.out.print("이름? ");
		this.name = keyScan.nextLine();

		System.out.print("이메일? ");
		this.email = keyScan.nextLine();

		System.out.print("암호? ");
		this.pw = keyScan.nextLine();

	}

	static boolean confirm2(String message) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("n") || response.equals("no") || response.equals("")) {
			return false;
		}
		return true;
	}

}
