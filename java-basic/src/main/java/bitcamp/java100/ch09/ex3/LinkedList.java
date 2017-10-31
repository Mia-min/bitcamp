package bitcamp.java100.ch09.ex3;

public class LinkedList {

	private class Box {
		Object value;
		Box next;
	}

	Box head;
	Box tail;
	
	int len;

	public void add(Object value) {
		Box box = new Box();

		box.value = value;

		if (tail == null) {
			head = box;
			tail = box;
		} else {
			tail.next = box;
			tail = box;
		}

		len++;

	}

	public int size() {
		return len;
	}

	public Object get(int index) {
		if (index < 0 || index >= len)
			return null;

		Box box = head;

		for (int cnt = 1; cnt <= index; cnt++) {
			box = box.next;

		}

		return box.value;
	}

	public void insert(int index, Object value) {

		if (index < 0 || index >= len)
			return;

		Box box = new Box();
		box.value = value;// 새로운 박스를 만든다.

		len++; // 앞의 len++;과 같음

		if (index == 0) {
			box.next = head;
			head = box;
			return;// index가 0일 경우
		}

		Box prev = head;
		// 값을 삽입 할 박스의 바로 전 위치를 알아낸다.
		for (int i = 1; i < index - 1; i++) {
			prev = prev.next;
		}

		// 새 박스가 삽입 될 위치의 박스를 가리키게 한다.
		box.next = prev.next;

		// 바로 전 박스는 새 박스를 가리키게 한다.
		prev.next = box;
	}

	public Object remove(int index) {
		if (index < 0 || index >= len)
			return null;

		len--;

		Box removedBox;

		if (index == 0) {
			removedBox = head;
			head = head.next;
			return removedBox.value;
		}

		Box prev = head;
		for (int i = 1; i < index - 1; i++) {
			prev = prev.next;
		}

		removedBox = prev.next;
		prev = prev.next.next;

		if (index == len - 1) {
			tail = prev;
		}

		return removedBox.value;
	}
}
