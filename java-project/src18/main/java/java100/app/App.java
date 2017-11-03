//: ## ver 18
//: - 기능 추가: 변경, 삭제 기능을 추가하라!
//: - 요구사항
//:   - App.java 클래스의 주석을 확인하라!
//: 
//: 
/*

성적관리> add
이름? 홍길동
국어? 100
영어? 100
수학? 100
계속 입력하시겠습니까?(Y/n) <== 'Y' 또는 'y', 그냥 엔터치기 
이름? 임꺽정
국어? 90
영어? 90
수학? 90
계속 입력하시겠습니까?(Y/n) n

성적관리> list
홍길동, 300, 100.0
임꺽정, 270, 90.0
성적관리> view
이름? 홍길동
홍길동, 100, 100, 100, 300, 100.0

성적관리> view
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.
성적관리> delete
이름? 홍길동
정말 삭제하시겠습니까?(y/N) y <== 'Y', 'y'를 입력해야 삭제된다.
삭제하였습니다.

성적관리> delete
이름? 임꺽정
정말 삭제하시겠습니까?(y/N) n
삭제취소하였습니다.

성적관리> delete
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> update
이름? 홍길동
국어?(100) 80    <== 엔터를 치면 원래 점수 유지
영어?(100) 
수학?(100) 90
변경하시겠습니까?(y/N) y<== 'Y', 'y'를 입력해야 변경된다.
변경하였습니다.

성적관리> update
이름? 홍길동
국어?(100) 80    <== 엔터를 치면 원래 점수 유지
영어?(100) 
수학?(100) 90
변경하시겠습니까?(y/N) n<== 'Y', 'y'를 입력해야 변경된다.
변경취소하였습니다.

성적관리> update
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> remove
수행할 수 없는 명령입니다.

성적관리> quit
프로그램을 종료합니다.

 */
package java100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	static Scanner keyScan = new Scanner(System.in);

	static String prompt(String message) {
		System.out.print(message);
		return keyScan.nextLine();
	}

	static boolean confirm(String message) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("y") || response.equals("yes") || response.equals("")) {
			return true;
		}
		return false;
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
	
	static boolean confirm3(String message) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("n") || response.equals("no") || response.equals("")) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		ArrayList<Score> list = new ArrayList<>();
		Iterator<Score> iterator = list.iterator();

		loop: while (true) {
			System.out.print("성적관리> ");
			String input = keyScan.nextLine();

			switch (input) {
			case "add":
				System.out.println("[학생 등록]");

				while (true) {
					Score score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
					score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.

					list.add(score);

					if (!confirm("계속하시겠습니까?(Y/n) "))
						break;
				}

				break;

			case "list":
				System.out.println("[학생 목록]");

				iterator = list.iterator();

				while (iterator.hasNext()) {
					iterator.next().print();
				}

				break;

			case "view":
				System.out.println("[학생 정보]");

				String name = prompt("이름? ");

				Score score = null;

				iterator = list.iterator();

				while (iterator.hasNext()) {
					Score temp = iterator.next();
					if (temp.name.equals(name)) {
						score = temp;
						break;
					}

				}

				if (score == null) {
					System.out.printf("%s 의 성적 정보가 없습니다.\n", name);
				} else {
					score.printDetail();
				}

				break;

			case "update":
				System.out.println("[학생 정보 변경]");
				break;

			case "del":
				System.out.println("[학생 삭제]");

				String name3 = prompt("이름? ");

				Score score3 = null;

				iterator = list.iterator();

				while (iterator.hasNext()) {
					Score temp = iterator.next();
					if (temp.name.equals(name3)) {
						score = temp;
						if (confirm2("정말 삭제하시겠습니까? (y/n)")) {
							list.remove(score3);
							System.out.printf("%d의 정보를 삭제하였습니다.", name3);
						} else {
							System.out.println("삭제를 취소했습니다.");
						}
						break;
					}

				}
				break;

			case "quit":
				System.out.println("프로그램을 종료합니다.");
				break loop;
			default:
				System.out.println("실행할 수 없는 명령입니다.");
			}

			System.out.println();
		}

	}
}