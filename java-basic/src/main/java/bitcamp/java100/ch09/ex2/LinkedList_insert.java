package bitcamp.java100.ch09.ex2;

import org.junit.validator.ValidateWith;

public class LinkedList_insert {
	// 시작 상자의 이름을 지어주자.
	Box head;// 박스 클래스는 헤드이다.
	Box tail;// 박스 클래스는 테일이다.

	// 전체 상자 개수
	int len;

	// box클래스의 object value값을 받아오는 메서드 만들기
	public void ov(Object value) {
		// 인스턴스 생성자를 이용해 값을 저장할 box라는 이름의 박스를 만들어준다.
		Box box = new Box();
		// 상자에 value라는 값을 담는다.
		box.value = value;

		// 현재까지 박스 한개가 생성되었다.

		if (tail == null) {// 만약 박스의 마지막에 값이 없다면
			head = box;
			tail = box;
			// 그 박스는 한개일 수 있으니 머리도 될 수 있고, 꼬리도 될 수 있다.
		} else {// 만약 하나 이상이라면
			tail.next = box;// 마지막 박스 다음의 것도 박스이고
			tail = box;// 마지막 박스도 박스이다.
		}

		len++;// 전체 상자 개수를 계속 증가시길 것이다.
	}

	public int size() {// int의 크기는
		return len;// len을 계속 증가해서 반복시키는 값이다.
	}

	public Object get(int index) {// int index라는 오브젝트를 가져가보자
		if (index < 0 || index >= len)// 만약 인덱스 값이 0보다 작고 그리고 인덱스 값이 len보다 작거나 같으면
			return null; // 반복하지 마라

		Box box = head;// box라고 이름지어진 박스가 머리이다.
		for (int i = 1; i <= index; i++) {// 그렇다면 반복해라
			box = box.next;// 박스에 다음 박스 값을 넣어서
		}
		return box.value;// 그리고 박스의 값을 다시 되돌리자
	}

	public void insert(int index, Object obj) {
		if (index < 0 || index >= len)//만약 인덱스가 0보다 작거나 전체개수보다 크거나 같다면
			return; //되돌려라

		Box box = new Box();//박스를 하나 만들어준다.
		box.value = obj;//obj변수 값을 박스의 값에 넣고

		len++;//개수를 증가시켜라

		if(index == 0) {//만약 인덱스가 0과 같다면
			box.next = head;//헤드는 박스의 다음값이다
			head = box;//그 박스도 헤드라 칭하는데
			return;//반복하지 말아라
		}
		
		Box prev = head;
		for(int i = 1; i < index; i++) {
			prev = prev.next;
		}
		box.next = prev.next;
		prev.next = box;
	}

}
