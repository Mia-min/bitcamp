//컬렉션 - 배열 사용하기 두번째
//array 클래스를 이용해 배열을 사용해보자
package bitcamp.java100.ch09.ex1;

public class Test3 {
	public static void main(String[] args) {

		// array 클래스를 만든다.

		Insert list = new Insert();

		// list 값을 받아오니까 저장하는 값도 리스트값으로 선언해야한다.
		list.add(new String("홍길동"));
		list.add(new Integer(100));
		list.add(80);//new Integer가 포함되어 있다. 생략 가능하다.
		list.add(70);
		list.add(250);
		list.add(250 / 3f);
		list.add("임꺽정");
		list.add(80);
		list.add(80);
		list.add(80);
		list.add(240);
		list.add(240 / 3f);

		// 값을 출력한다.
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %s\n", i, list.get(i));
		}
		System.out.println("____________________________________________");
		
		//값을 추가한다.
		list.insert(6, "유관순");//6번째 배열에 유관순을 넣어라

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %s\n", i, list.get(i));
		}
		System.out.println("-------------------------------");
		
		list.insert(0, "공부를 시작해 봅시다");//0번째 배열에 다음 글을 넣어라

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %s\n", i, list.get(i));
		}
		System.out.println("-------------------------------");

	}
	
	
}
