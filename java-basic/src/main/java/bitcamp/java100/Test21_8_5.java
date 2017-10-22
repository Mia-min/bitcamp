// ## String 클래스 사용법 - String 인스턴스 생성
// - 개발자가 문자열을 쉽게 다룰 수 있도록 자바에게 기본으로 제공하는 부품이다.
// - 문자열을 저장하려면 char 배열이 필요한데,
//   개발자가 직접 char 배열을 다루는 것이 아니라
//   String 클래스에서 제공해주는 메서드를 사용하여 char 배열 메모리를 다룬다.
//

package bitcamp.java100;

import java.io.Console;

public class Test21_8_5 {

	// 콘솔 객체를 준비한다.
	static Console console;

	//ㅇㅇㅇ을 담을 래퍼런스 배열을 만든다
	static Contact[] contacts = new Contact[100];

	static int cursor = 0;

	static class Contact {
		String name;
		String email;
		String tel;
	}

	static void printContacts() {
		for (int i = 0; i < cursor; i++) {
			System.out.printf("%s, %s, %s\n", contacts[i].name, contacts[i].email, contacts[i].tel);
		}
	}

	static boolean confirm(String message) {
		String input = console.readLine(message + "(y/n) ");
		if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes"))
			return true;
		return false;
	}
	
	static Contact inputContact() {
		//사용자가 입력한 데이터를 저장할 메모리 준비
		Contact contact = new Contact();
		
		//사용자의 입력을 받을 문법, 사용자가 입력한 데이터를 Contact 인스턴스에 저장한다.
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
		while (cursor < contacts.length) {
			
			Contact contact = inputContact();
			
			if (confirm("저장하시겠습니까? ")) {
				//데이터가 들어있는 인스턴스 주소를 배열에 저장
				contacts[cursor] = contact;
				cursor++;
			}

			if (!confirm("계속 입력하시겠습니까? "))// 이게 참이 아니라면 = 만약 !계속 입력하지 않겠다면
				break;// 실행해라 = 반복문을 멈춰라
		}
		printContacts();
	}

}
