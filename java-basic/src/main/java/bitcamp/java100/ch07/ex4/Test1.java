package bitcamp.java100.ch07.ex4;

public class Test1 /* extends Object */ {
	public static void main(String[] args) {
		// 해당 인스턴스가 어떤 클래스의 자손인지 검사하기
		// instance0f

		Test1 obj = new Test1();

		if (obj instanceof Test1) {
			System.out.println("obj는 Test1의 인스턴스이다.");
		}
		
		if (obj instanceof Object) {
			System.out.println("obj는 Object의 인스턴스이다.");
		}
		
		Class c = Test1.class;//Test1.클래스 파일 아님!!!!! 현재 정보를 담은 인스턴스 주소를 얻는다.
		
		Class sc = c.getSuperclass();//Test1의 수퍼 클래스의 정보를 담은 인스턴스 주소를 얻는다.
		System.out.println(sc.getName());
		
		Class sc2 = sc.getSuperclass();
		System.out.println(sc2);
	}
}
