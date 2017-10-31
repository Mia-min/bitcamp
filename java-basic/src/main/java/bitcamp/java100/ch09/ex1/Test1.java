//컬렉션 - 배열 사용하기 첫번째
package bitcamp.java100.ch09.ex1;

import org.omg.CORBA.OBJ_ADAPTER;

public class Test1 {
	public static void main(String[] args) {
		//객체 주소를 저장할 레퍼런스 배열을 만든다.
		Object[] arr = new Object[10000];
		
		//값을 저장할 위치를 가리키는 변수를 준비한다.
		int cursor = 0;
		
		//값을 저장한다.
		arr[cursor++] = new String("가");
		arr[cursor++] = 100;
		arr[cursor++] = 100;
		arr[cursor++] = 100;
		arr[cursor++] = 100;
		arr[cursor++] = 400 / 4f;
		
		//값을 출력한다.
		for(int i = 0; i < cursor; i++) {
			System.out.println(arr[i]);
		}
		//이렇게 배열을 사용하여 여러개의 타입을 다룰 수 있다.
		//그러나 만개의 타입을 모두 손으로 작성해야 한다.
		//또한 오브젝트 타입의 배열을 사용하려면 모든 타입의 객체 주소를 저장할 수 있다.
	}
}
