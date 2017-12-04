package bitcamp.java100.ch20.ex2;

public class MyClass3 {
	
	public MyClass3(String name) {
		System.out.println("MyClass3(String)");
	}
	
	public MyClass3(float left, float right) {
		System.out.println("MyClass3(flaot, float)");
	}
	
	public MyClass3(MyClass MyClass) {
		System.out.println("MyClass3(MyClass)");
	}
	
	public MyClass3(MyClass2 MyClass2) {
		System.out.println("MyClass3(MyClass2)");
	}
	
	public MyClass3(MyClass3 MyClass3) {
		System.out.println("MyClass3(MyClass3)");
	}
	
}
