package bitcamp.java100.ch09.ex6;

public class Queue {

	private class Box {
		Object value;
		Box next;

		public Box(Object value) {
			this.value = value;
		}
	}
	//시작과 끝 위치의 상자 주소 보관
	Box head;
	Box tail;

	int len;

	public void add(Object value) {
		//새로운 상자를 만들어 값을 저장한다.
		Box box = new Box(value);
		
		if(tail != null)//꼬리가 널값(비어이는 값)이 아니라면
			tail.next = box;//꼬리 다음은 새 상자로 이동하게 한다.
		
		// 새 상자는 꼬리쪽에 가서 만을어지게 한다.
		tail = box;
		
		// 상자 개수를 증가시킨다.
		len++;

		if(head == null) {
			head = box;
		}
	}

	public int size() {
		return len;
	}

	public Object poll() {
		if (len == 0)// 0이니까 꺼낼것이 없으므로 null값을 리턴한다.
			return null;

		// 리턴할 값을 담은 박스의 주소를 보관한다.
		Box box = head;

		head = head.next;

		// 상자의 개수를 줄인다
		len--;

		return box.value;
	}

}
