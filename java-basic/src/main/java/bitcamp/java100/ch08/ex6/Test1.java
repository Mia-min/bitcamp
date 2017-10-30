package bitcamp.java100.ch08.ex6;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		
		Score s1 = new Score(1, "홍길동", 100, 100, 100);
		Score s2 = new Score(1, "홍길동", 100, 100, 100);
		
		ArrayList List = new ArrayList();
		//같은 객체를 중복해서 객체의 주소를 보관한다.
		
		List.add(s1);
		List.add(s1);
	
		System.out.println(List.size());
		System.out.println(List.get(0).toString());
		System.out.println(List.get(1).toString());

		System.out.println("____________________________________________________");
		
		HashSet set = new HashSet();
		
		set.add(s1);
		set.add(s1);
		
		System.out.println(set.size());
		
		set.add(s2);
		
		System.out.println(set.size());
		
		System.out.println("____________________________________________________");
		
		System.out.printf("s1의  %b\n",s1.equals(s2));
		System.out.printf("s1의 해쉬코드는 %d\n",s1.hashCode());
		System.out.printf("s2의 해쉬코드는 %d",s2.hashCode());
	}
}
