
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

	public void update() {
		Scanner keyScan = new Scanner(System.in);

		System.out.printf("이름?(%s) ", this.name);
		String name = keyScan.nextLine();
		if(name.isEmpty()) {
			name = this.name;
		}

		System.out.printf("암호?(%s) ", this.pw);
		String pw = keyScan.nextLine();
		if(pw.isEmpty()) {
			pw = this.pw;
		}

		if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
			this.name = name;
			this.pw = pw;
			System.out.println("변경하였습니다.");

		} else {
			System.out.println("변경을 취소하였습니다.");
		}
	}

	public void printDetail() {
		System.out.printf("이름: %s\n", this.name);
		System.out.printf("이메일: %s\n", this.email);
		System.out.printf("암호: %s\n", this.pw);

	}

	public void print() {
		System.out.printf("%s, %s\n", this.name, this.email);
	}

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
