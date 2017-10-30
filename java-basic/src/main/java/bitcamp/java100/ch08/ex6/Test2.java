package bitcamp.java100.ch08.ex6;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {
	public static void main(String[] args) {
		//해쉬코드 재정의 하기 전
		Score s1 = new Score(1, "홍길동", 100, 100, 100);
		Score s2 = new Score(1, "홍길동", 100, 100, 100);
		
		HashSet set = new HashSet();
		
		set.add(s1);
		set.add(s1);
		
		System.out.println(set.size());
		
		set.add(s2);
		
		System.out.println(set.size());
		
		System.out.printf("s1의  %b\n",s1.equals(s2));
		System.out.printf("s1의 해쉬코드는 %d\n",s1.hashCode());
		System.out.printf("s2의 해쉬코드는 %d\n",s2.hashCode());
		
		System.out.println("____________________________________________________");
		
		Score2 s3 = new Score2(1, "홍길동", 100, 100, 100);
		Score2 s4 = new Score2(1, "홍길동", 100, 100, 100);
		
		HashSet set2 = new HashSet();
		
		set2.add(s3);
		set2.add(s4);
		
		System.out.println(set2.size());
		
		System.out.printf("s3의  %b\n",s3.equals(s4));
		System.out.printf("s3의 해쉬코드는 %d\n",s3.hashCode());
		System.out.printf("s4의 해쉬코드는 %d",s4.hashCode());
		
		
	}
}
