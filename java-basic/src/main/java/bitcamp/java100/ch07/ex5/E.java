package bitcamp.java100.ch07.ex5;

public class E extends A {

	String name;
	int age;

	E() {
		this("가나다", 20);
	}

	E(String name) {
		this.name = name;
		this.age = 20;
	}
	
	E(int age) {
		this.name = "홍길동";
		this.age = age;
	}

	E(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
