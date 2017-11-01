package bitcamp.java100.ch09.ex7;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍길동";
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		list.add(null);
		
		list.add(new String("홍길동"));
		list.add(new String("임꺽정"));
		list.add(new String("유관순"));
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
