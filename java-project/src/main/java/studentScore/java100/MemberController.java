package studentScore.java100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberController {

	static Scanner keyScan = new Scanner(System.in);

	// 성적 데이터를 보관하는 목록 객체는 외부 노출을 막는다.
	private ArrayList<Member> list = new ArrayList<>();
	Iterator<Member> iterator = list.iterator();

	public void execute() {
		loop: while (true) {
			System.out.print("회원관리> ");
			String input = keyScan.nextLine();

			// 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
			switch (input) {
			case "add":
				this.doAdd();
				break;

			case "list":
				this.doList();
				break;

			case "view":
				this.doView();
				break;

			case "update":
				this.doUpdate();
				break;

			case "delete":
				this.doDelete();
				break;

			case "main":
				break loop;
			default:
				System.out.println("해당 명령이 없습니다.");
			}
		}
	}

	private void doDelete() {
		System.out.println("[회원 삭제]");
		String name = Prompts.input("이름? ");

		Member member = null;
		Iterator<Member> iterator = list.iterator();
		while (iterator.hasNext()) {
			Member temp = iterator.next();
			if (temp.name.equals(name)) {
				member = temp;
				break;
			}
		}

		if (member == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
				list.remove(member);
				System.out.println("삭제하였습니다.");
			} else {
				System.out.println("삭제를 취소하였습니다.");
			}
		}
	}

	private void doUpdate() {
		System.out.println("[회원 정보 변경]");
		String name = Prompts.input("이메일? ");

		Member member = null;
		Iterator<Member> iterator = list.iterator();
		while (iterator.hasNext()) {
			Member temp = iterator.next();
			if (temp.name.equals(name)) {
				member = temp;
				break;
			}
		}

		if (member == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			member.update();
		}
	}

	private void doView() {
		System.out.println("[회원 정보]");
		String name = Prompts.input("이름? ");

		Member member = null;
		Iterator<Member> iterator = list.iterator();
		while (iterator.hasNext()) {
			Member temp = iterator.next();
			if (temp.name.equals(name)) {
				member = temp;
				break;
			}
		}

		if (member == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			member.printDetail();
		}
	}

	private void doList() {
		System.out.println("[회원 목록]");

		iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}

	private void doAdd() {
		System.out.println("[회원 등록]");

		Member member;
		while (true) {
			member = new Member(); // 성적 데이터를 저장할 빈 객체를 준비한다.
			member.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.

			boolean isExist = false;
			Iterator<Member> iterator = list.iterator();
			while (iterator.hasNext()) {
				Member temp = iterator.next();
				if (temp.email.equals(member.email)) {
					isExist = true;
					break;
				}
			}

			if (isExist) {
				System.err.println("이미 등록된 이메일 입니다.");
			} else {
				list.add(member);
			}
			
			if (!Prompts.confirm("계속하시겠습니까?(Y/n) "))
				break;
		}
	}
}
