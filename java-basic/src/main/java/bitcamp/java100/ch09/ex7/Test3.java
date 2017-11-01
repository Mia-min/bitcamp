package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test3 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍길동";
		
		set.add(new String("홍길동"));
		set.add(new String("임꺽정"));
		set.add(new String("유관순"));
		
		System.out.println(set.size());
		
		String[] arr = new String[set.size()];//여기에 setsize 넣으면 배열이 같아지는데 여기 넣는거 어떻게 앎?
		String[] arr2 = set.toArray(arr);
		
		if(arr == arr2) {
			System.out.println("arr == arr2");
		}else {
			System.out.println("arr != arr2");
		}
		
		for(String s : arr) {
			System.out.printf("%s ", s);
		}
			
		
		for(int i = 0; i < set.size(); i++) {
			//System.out.println(set.get(i));
		}
		
		System.out.println();
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
