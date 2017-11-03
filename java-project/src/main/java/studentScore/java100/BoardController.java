package studentScore.java100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardController {

	static Scanner keyScan = new Scanner(System.in);
	private ArrayList<Board> list = new ArrayList<>();
	Iterator<Board> iterator = list.iterator();

	public void execute() {
		loop: while (true) {
			System.out.print("게시판 > ");
			String input = keyScan.nextLine();

			switch (input) {
//			case "add":
//				this.doAdd();
//				break;

			case "list":
				this.doList();
				break;

//			case "view":
//				this.doView();
//				break;
//
//			case "update":
//				this.doUpdate();
//				break;
//
//			case "delete":
//				this.doDelete();
//				break;

			case "main":
				break loop;
			default:
				System.out.println("해당 명령이 없습니다.");
			}
		}
	}

	private void doList() {
		System.out.println("[게시판 목록]");

		Iterator<Board> = list.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}

	private void doAdd() {
		System.out.println("[게시물 등록]");

		Board board;
		while (true) {
			board = new Board(); // 데이터를 저장할 빈 객체를 준비한다.
			board.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.

			boolean isExist = false;
			Iterator<Board> iterator = list.iterator();
			while (iterator.hasNext()) {
				Board temp = iterator.next();
				if (temp.num.equals(num)) {
					isExist = true;
					break;
				}
			}

			if (isExist) {
				System.err.println("\n 이미 등록된 게시물 번호 입니다.");
			} else {
				list.add(board);
			}

			if (!Prompts.confirm("계속하시겠습니까?(Y/n) "))
				break;
		}
	}

}
