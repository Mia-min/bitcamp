package bitcamp.java100.ch09.ex2;

public class Test3 {

	static void printList(LinkedList_remove list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s / ", list.get(i));
		}
		System.out.println();
		System.out.println("___________________________");
	}

	public static void main(String[] args) {
		// LinkedList에 만든 내용을 사용할 것이다.
		LinkedList_remove list = new LinkedList_remove();

		list.ov("가가가");
		list.ov("나나나");
		list.ov("다다다");
		list.ov("라라라");

		printList(list);

		list.remove(1);

		printList(list);

		list.remove(0);

		printList(list);
		
		System.out.println(list.remove(1));

		printList(list);

	}
}
