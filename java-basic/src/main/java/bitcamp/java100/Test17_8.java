//## 메서드 - 용도의 사용 예
//

package bitcamp.java100;

public class Test17_8 {
	
	static class Member{
		String name;
		int age;
		boolean working;
		float score;
		char level;
	}
	
	static Member m1() {
		Member ref = new Member();
		ref.name = "홍길동";
		ref.age = 20;
		ref.working = false;
		ref.score = 4.25f;
		ref.level = 'm';
		
		return ref;
	}
	
	public static void main(String[] args) {
		
		Member mem = m1();
		
		System.out.println(mem.name);
		System.out.println(mem.age);
		System.out.println(mem.working);
		System.out.println(mem.score);
		System.out.println(mem.level);
		
	}
}
