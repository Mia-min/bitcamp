
//## 문자 - 블록과 변수의 범위
//

package bitcamp.java100;

public class Test16_7 {

	 public static void main(String[] args) {
	 	String[] name = {"홍길동","임꺽정","유관순","안중근","윤봉길"};
	 	for (String n : name) {
	 		System.out.println(n);
	 	}
	 	
	 	System.out.println("--------------------------");
	 	
	 	int[] kor = {100, 90, 80, 70, 50};
	 	for(int score : kor) {
	 		System.out.println(score);
	 	}
	 	
	 	System.out.println("--------------------------");
	 	
	 	java.util.ArrayList<String> list = new java.util.ArrayList<>();
	 	list.add("홍길동");
	 	list.add("임꺽정");
	 	list.add("유관순");
	 	list.add("안중근");
	 	list.add("윤봉길");
	 	list.add("홍길동");
	 	list.add("임꺽정");
	 	
	 	for (String n : list) {
	 		System.out.println(n);
	 	}
	 	
	 	System.out.println("--------------------------");
	 	
	 	java.util.HashSet<String> set = new java.util.HashSet<>();
	 	set.add("홍길동");
	 	set.add("임꺽정");
	 	set.add("유관순");
	 	set.add("안중근");
	 	set.add("윤봉길");
	 	set.add("홍길동");
	 	set.add("임꺽정");
	 	
	 	for (String n : set) {
	 		System.out.println(n);
	 	}
 	 }
}