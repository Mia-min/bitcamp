package bitcamp.java100.ch09.ex2;

import bitcamp.java100.ch09.ex1.Insert;

public class Test2 {

	//먼저 반복 출력문(for sysout)은 계속 똑같이 등장해야 하기 때문에 분리해서 간결하게 사용할 수 있도록 한다.
	static void printList(LinkedList_insert list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s / ", list.get(i));
		}
		System.out.println();
		System.out.println("_____________________");
	}
	
	public static void main(String[] args) {

		// LinkedList_insert에 만든 내용을 사용할 것이다.
		LinkedList_insert list = new LinkedList_insert();

		list.ov("가가가");
		list.ov("나나나");
		list.ov("다다다");
		list.ov("라라라");
		
		printList(list);
		
		list.insert(2, "0 1 2의 뒤 값인 다에 insert");

		printList(list);
		
		list.insert(1, "0 1의 뒤 값인 다에 insert");

		printList(list);
		
		list.insert(0, "0 1의 뒤 값인 다에 insert");

		printList(list);
		
	}
}
