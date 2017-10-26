
package bitcamp.java100.test21.ex8;

import java.io.Console;

public class Test21_8_9 {

	static Console console;

	static void printContacts() {
		for (int i = 0; i < ContactArray.size(); i++) {
			Contact contact = ContactArray.get(i);// i번째에 있는 연락처 정보를 가져와라
			System.out.printf("%s, %s, %s\n", contact.name, contact.email, contact.tel);
		}
	}

	static boolean confirm(String message) {
		String input = console.readLine(message + "(y/n) ");
		if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes"))
			return true;
		return false;
	}

	static Contact inputContact() {
		// 사용자가 입력한 데이터를 저장할 메모리 준비
		Contact contact = new Contact();

		// 사용자의 입력을 받을 문법, 사용자가 입력한 데이터를 Contact 인스턴스에 저장한다.
		contact.name = console.readLine("이름? "); // 이름을 입력해주세요
		contact.email = console.readLine("이메일? ");
		contact.tel = console.readLine("전화? ");

		return contact;
	}

	public static void main(String[] args) {

		console = System.console();

		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1); // JVM을 종료한다.
		}

		// 배열의 개수 만큼 입력을 받는다.
		while (true) {

			Contact contact = inputContact();

			if (confirm("저장하시겠습니까? ")) {
				try {
					ContactArray.add(contact);
				} catch (RuntimeException e) {
					System.err.println("최대 저장 개수를 초과하였습니다.!");
				}
			}

			if (!confirm("계속 입력하시겠습니까? "))// 이게 참이 아니라면 = 만약 !계속 입력하지 않겠다면
				break;// 실행해라 = 반복문을 멈춰라
		}
		printContacts();
	}

}
