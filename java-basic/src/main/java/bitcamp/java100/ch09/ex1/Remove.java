package bitcamp.java100.ch09.ex1;

//array클래스는 개발자가 여러개의 주소를 다루기 위해 만든 메모리 구조이다.
//새로운 타입을 정의하면 그 타입의 데이터를 다루는 연산자가 필요하다.
public class Remove {
	// 변수를 인스턴스로 만들 것인지 스태틱으로 만들 것인지 결정해야 한다.
	// 배열을 한개만 만들어서 순차적으로 사용할 생각이라면 스태틱 변수(static)로 만들자
	// 배열을 여러개 만들어서 사용하고 싶다면 인스턴스 변수(new)로 만들자

	// 나는 인스턴스 변수로 만들것이다.

	// 공개하지 않을것이니 비공개 클래스(private)으로 만들자
	private Object[] arr = new Object[10000];
	private int cursor = 0;

	// 연산자를 정의하자
	public void add(Object obj) { // add라는 오브젝트의 메소드를 만든다.
		if (cursor == arr.length)// 만약 cursor의 길이가 arr과 같다면 값을 리턴해라
			return;
		arr[cursor++] = obj;// obj는 arr의 배열로 o부터 증가시켜라
	}

	public int size() {// 사이즈는 인트값으로 표현하자
		return cursor;
	}

	public Object get(int index) {
		if (index < 0 || index >= cursor)
			return null;
		return arr[index];
	}
	
	public void insert(int index, Object value) {
		if(cursor == arr.length)
			return;
		
		if(index < 0 || index >= cursor)
			return;
		
		for(int i = cursor - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		
		arr[index] = value;
		
		cursor++;
	}
	
	public Object remove(int index) {
		if(index < 0 || index >= cursor) 
			return null;
		
		Object removeValue = arr[index];
		
		for(int i = index; i < cursor - 1; i++) {
			arr[i] = arr[i + 1];
		}
		
		cursor--;
		
		return removeValue;
		
	}
}
