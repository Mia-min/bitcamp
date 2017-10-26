package bitcamp.java100.ch07.ex4;

public class Test2 /* extends Object */ {
	public static void main(String[] args) {
		Test2 obj = new Test2();
		System.out.println(obj.toString());
		System.out.println(Integer.toHexString(obj.hashCode()));
		
		Test2 obj2 = new Test2();
		System.out.println(obj.equals(obj2));
		
		String s1 = new String("헬로");
		String s2 = new String("헬로");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("-----------------------------------------------------------------");
		
		StringBuffer sb1 = new StringBuffer("안녕");
		StringBuffer sb2 = new StringBuffer("안녕");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		Class c = obj.getClass();
		System.out.println(c.getName());
	}
}
