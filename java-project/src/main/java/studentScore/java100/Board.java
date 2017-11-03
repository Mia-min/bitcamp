package studentScore.java100;

import java.sql.Date;
import java.util.Scanner;

public class Board {

	protected int num;
	protected String title;
	protected String contents;
	protected Date regDate;//sql선택
	protected int viewCount;
	
	public Board() {
	
	}

	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", contents=" + contents + "]";
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public void print() {
		System.out.printf("%d, %s, $s, %d\n this.num, this);
	}

	public void input() {
		Scanner keyScan = new Scanner(System.in);

		System.out.print("번호? ");                                  bv.num = keyScan.nextInt();

		System.out.print("제목? ");
		this.title = keyScan.nextLine();

		System.out.print("내용? ");
		this.contents = keyScan.nextLine();

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
