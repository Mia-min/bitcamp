package bitcamp.java100.ch09.ex2;

public class Test1 {

	public static void main(String[] args) {
		//LinkedList에 만든 내용을 사용할 것이다.
		LinkedList list = new LinkedList();
		
		list.ov("가가가");
		list.ov("나나나");
		list.ov("다다다");
		list.ov("라라라");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
	}
}
